package rs.ac.isum.dao;

import java.util.List;
import java.util.Map;

import org.hibernate.Session;
import rs.ac.isum.entities.AbstractEntity;
//import rs.ac.isum.entities.IsumUser;

public interface GenericDao<T extends AbstractEntity> {

    public abstract T saveOrUpdate(T obj);
    
    public abstract List<T> findByExample(T obj, Class klasa);

    public abstract List<T> loadAllActive(Class klasa);
    
    public abstract List<T> loadByColumnRestriction(Class klasa, String imeKolone, Object kriterijum);

    public abstract T delete(T obj);

    public abstract void deleteList(List<T> list);

    public abstract T merge(T obj);

    public void flush();

    public T loadById(Class klasa, long id);    
    
    public abstract Session getSession();

    public T loadByIdNoLazy(Class klasa, long id, String nazivListe);

//    public List<IsumUser> loadByColumnRestriction(Class klasa, Map<String, Object> kolone);
    
}
