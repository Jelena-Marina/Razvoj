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
import rs.ac.isum.entities.Izdavac;
import rs.ac.isum.entities.Jezik;
import rs.ac.isum.entities.Knjiga;
import rs.ac.isum.entities.Oblast;
import rs.ac.isum.entities.Osoba;
import rs.ac.isum.entities.Publikacija;
import rs.ac.isum.entities.Student;
import rs.ac.isum.entities.Zaduzenja;
import rs.ac.isum.entities.Zaposleni;
import rs.ac.isum.entities.ZaposleniBibliotekar;

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
        System.out.println("");
        return dao.loadAllActive(Jezik.class);
    }

    @Override
    public void obrisiAutora() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Izdavac> sviIzdavaci() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Knjiga> sveKnjige() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Oblast> sveOblaste() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Osoba> sveOsobe() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Publikacija> svePublikacija() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Student> sviStudenti() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Zaduzenja> svaZaduzenja() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Zaposleni> sviZaposleni() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ZaposleniBibliotekar> sviBibliotekari() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
