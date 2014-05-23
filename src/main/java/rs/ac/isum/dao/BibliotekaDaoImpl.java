/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rs.ac.isum.dao;

import java.util.List;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.hibernate.Session;
import rs.ac.isum.entities.Autor;
import rs.ac.isum.entities.Jezik;

/**
 *
 * @author Jelena
 */
public class BibliotekaDaoImpl implements BibliotekaDao{
    @Inject
    private Session hibernate;
    @Inject
    private GenericDao dao;
    

    @Override
    public List<Autor> sviAutori() {
        return dao.loadAllActive(Autor.class);
    }

    @Override
    public List<Jezik> sviJezici() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
