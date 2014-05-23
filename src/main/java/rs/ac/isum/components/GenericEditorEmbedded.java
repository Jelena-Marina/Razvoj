package rs.ac.isum.components;

import java.util.ArrayList;
import java.util.List;

import org.apache.tapestry5.Block;
import org.apache.tapestry5.ComponentResources;
import org.apache.tapestry5.PropertyConduit;
import org.apache.tapestry5.annotations.Component;
import org.apache.tapestry5.annotations.Import;
import org.apache.tapestry5.annotations.Parameter;
import org.apache.tapestry5.annotations.Persist;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.beaneditor.BeanModel;
import org.apache.tapestry5.corelib.components.Form;
import org.apache.tapestry5.corelib.components.Zone;
import org.apache.tapestry5.hibernate.annotations.CommitAfter;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.apache.tapestry5.json.JSONObject;
import org.apache.tapestry5.services.BeanModelSource;
import org.apache.tapestry5.services.PropertyConduitSource;
import org.apache.tapestry5.services.Request;

import rs.ac.isum.dao.GenericDao;
import rs.ac.isum.entities.AbstractEntity;

/**
 *
 * @author aleksandar.slijepcev
 *
 * @param <T>
 */
public class GenericEditorEmbedded<T extends AbstractEntity> {

    @Persist
    private T bean;
    @Parameter("true")
    @Property
    private boolean isPage;
    @Inject
    @Property
    private Block blok;
    private T beanGrid;
    @Inject
    private PropertyConduitSource conduit;
    @Component
    private Form form;
    @Inject
    private GenericDao genericDao;
    @Component
    private Zone zoneBeanEditor;
    @Inject
    private BeanModelSource beanModelSource;
    @Inject
    private ComponentResources componentResources;
    @Property
    private Class klasa;
    @Property
    private String searchTerm;
    @Parameter
    private boolean isTableSmall;
    @Inject
    private Request request;

    {
        PropertyConduit conduit1 = conduit.create(getClass(), "bean");
        klasa = conduit1.getPropertyType();
    }

    public List<T> getGrid() {
        List<T> temp = genericDao.loadAllActive(klasa);
        if (searchTerm == null || searchTerm.equals("")) {
            return temp;
        }
        List filtered = new ArrayList();
        for (T object : temp) {
            if (object.toString().toLowerCase()
                    .contains(searchTerm.toLowerCase())) {
                filtered.add(object);
            }
        }
        return filtered;
    }

//    public JSONObject getOptions() {
//
//        // The available options are documented at http://www.datatables.net/ref
//        JSONObject options = new JSONObject();
//        options.put("bInfo","false");
//        options.put("bLengthChange","false");
//        options.put("bProcessing","false");
//        return options;
//    }
    @CommitAfter
    public Object onSelectedFromSave() {
        if (!form.getHasErrors()) {
            form.clearErrors();
            genericDao.saveOrUpdate(bean);
            try {
                bean = (T) klasa.newInstance();
            } catch (InstantiationException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        return request.isXHR() ? zoneBeanEditor.getBody() : null;
    }

    @CommitAfter
    public Zone onActionFromEdit(long obj) {
        form.clearErrors();
        bean = (T) genericDao.loadById(klasa, obj);
        return zoneBeanEditor;
    }

    @CommitAfter
    public Zone onActionFromDelete(Long objekat) {
        genericDao.delete(genericDao.loadById(klasa, objekat));
        return zoneBeanEditor;
    }

    public Object onSelectedFromClear() {
        try {
            bean = (T) klasa.newInstance();
            form.clearErrors();
        } catch (InstantiationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return zoneBeanEditor;
    }

    public T getBean() {
        return bean;
    }

    public void setBean(T bean) {
        this.bean = bean;
    }

    public BeanModel<T> getFormModel() {
        return beanModelSource.createEditModel(klasa,
                componentResources.getMessages());
    }

    public BeanModel<T> getGridModel() {
        return beanModelSource.createDisplayModel(klasa,
                componentResources.getMessages());
    }

    public T getBeanGrid() {
        return beanGrid;
    }

    public void setBeanGrid(T beanGrid) {
        this.beanGrid = beanGrid;
    }

    public String getDiff() {
        return klasa.getSimpleName();
    }

}
