package rs.ac.isum.dao;

import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.tapestry5.ioc.annotations.Inject;
import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

import rs.ac.isum.entities.AbstractEntity;
//import rs.ac.isum.entities.IsumUser;
//import rs.ac.isum.entities.Predmet;

public class GenericDaoImpl <T extends AbstractEntity> implements GenericDao<T> {

    @Inject
    private Session hibernate;

    public void persist(T obj) {
        hibernate.persist(obj);
    }

    public List<T> findByExample(T obj, Class klasa) {
        Criteria criteria = hibernate.createCriteria(klasa);
        Example example = Example.create(obj);
        example.excludeZeroes();
        example.ignoreCase();
        example.enableLike(MatchMode.ANYWHERE);
        criteria.add(example);
        return criteria.list();
    }

    public T saveOrUpdate(T obj) {
        if (obj == null) {
            return null;
        }
        obj.setRecordStatus(1);
        obj.setLastModificationTime(new Date());
        try {
           // obj.setLastModifiedByUser(userService.getIsumUser().getUsername());
        } catch (NullPointerException n) {
            obj.setLastModifiedByUser("N/A");
        }
        hibernate.saveOrUpdate(obj);
        if (obj.getId() != null) {
            return (T) hibernate.createCriteria(obj.getClass()).add(Restrictions.eq("id", obj.getId())).uniqueResult(); //ukoliko je objekat vec ranije cuvan ovim smo sigurni da je vracen bas taj odgovarajuci jer ga ucitavamo po ID, u suprotnom ide query by example pa vraca prvi, tu se moze desiti da vise od jednog objekta odgovara kriterijumu pretrage
        } else {
            return findByExample(obj, obj.getClass()).get(0); //ukoliko je objekat sad sacuvan po prvi put, ovo je manje precizon
        }
    }

    public List<T> loadAllActive(Class klasa) {
        List<T> lista =  hibernate.createCriteria(klasa).add(Restrictions.eq("recordStatus", 1)).setResultTransformer(
                Criteria.DISTINCT_ROOT_ENTITY).list();
//        Collections.sort(lista);
        return lista;
    }

    public List<T> loadByColumnRestriction(Class klasa, String imeKolone, Object kriterijum) {
        return (List<T>) hibernate.createCriteria(klasa).add(Restrictions.eq("recordStatus", 1)).add(Restrictions.eq(imeKolone, kriterijum)).list();
    }

    public List<T> loadAllRowsFromTable(Class klasa) {
        return (List<T>) hibernate.createCriteria(klasa).list();
    }

    public T delete(Long idOfObj, Class klasa) {
        AbstractEntity tmpEntity = (AbstractEntity) hibernate.createCriteria(klasa).add(Restrictions.eq("id", idOfObj)).list().get(0);
        tmpEntity.setRecordStatus(3);
        hibernate.saveOrUpdate((T) tmpEntity);
        return (T) tmpEntity;
    }

    public T delete(T obj) {
        AbstractEntity tmpEntity = (AbstractEntity) obj;
        tmpEntity.setRecordStatus(3);
        hibernate.saveOrUpdate((T) tmpEntity);
        return (T) tmpEntity;
    }

    public void flush() {
        hibernate.flush();
    }

    public T loadById(Class klasa, long id) {
        return (T) hibernate.createCriteria(klasa).add(Restrictions.eq("id", id)).uniqueResult();
    }

    public T merge(T obj) {
        return (T) hibernate.merge(obj);
    }

    public void deleteList(List<T> list) {
        for (T t : list) {
            delete(t);
        }
    }

    public Session getSession() {
        return hibernate;
    }

    public List<T> loadByCriteria(Class klasa, Criterion... criterias) {

        Criteria kriterijumZaPretragu = hibernate.createCriteria(klasa);
        for (Criterion criterion : criterias) {
            kriterijumZaPretragu.add(criterion);
        }
        kriterijumZaPretragu.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
        return kriterijumZaPretragu.list();
    }

    public T loadByIdNoLazy(Class klasa, long id, String nazivListe) {
        return (T) hibernate.createCriteria(klasa).
                add(Restrictions.eq("id", id)).
                setFetchMode(nazivListe, FetchMode.JOIN).
                uniqueResult();
    }

//    public List<IsumUser> loadByColumnRestriction(Class klasa, Map<String, Object> kolone) {
//        Criteria criteria = hibernate.createCriteria(klasa);
//        for(String s : kolone.keySet())
//        {
//            criteria.add(Restrictions.eq(s, kolone.get(s)));
//        }
//        return criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
//    }
}
