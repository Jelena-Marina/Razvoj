/**
 * Klasa koja implementira metode iz BibliotekaDao interfejsa.
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
import rs.ac.isum.entities.AbstractEntity;

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
    public List<Izdavac> sviIzdavaci() {
        return dao.loadAllActive(Izdavac.class);
    }

    @Override
    public List<Knjiga> sveKnjige() {
        return dao.loadAllActive(Knjiga.class);
    }

    @Override
    public List<Oblast> sveOblaste() {
        return dao.loadAllActive(Oblast.class);
    }

    @Override
    public List<Osoba> sveOsobe() {
        return dao.loadAllActive(Osoba.class);
    }

    @Override
    public List<Publikacija> svePublikacija() {
        return dao.loadAllActive(Publikacija.class);
    }

    @Override
    public List<Student> sviStudenti() {
        return dao.loadAllActive(Student.class);
    }

    @Override
    public List<Zaduzenja> svaZaduzenja() {
        return dao.loadAllActive(Zaduzenja.class);
   }

    @Override
    public List<Zaposleni> sviZaposleni() {
        return dao.loadAllActive(Zaposleni.class);
    }

    @Override
    public List<ZaposleniBibliotekar> sviBibliotekari() {
        return dao.loadAllActive(ZaposleniBibliotekar.class);
    }

    @Override
    public void obrisiAutora(long id) {
        AbstractEntity autorTemp = (AbstractEntity) dao.loadById(Autor.class, id);
        dao.delete(autorTemp);
    }

    @Override
    public void izmeniAutora(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void dodajAutora(Autor autor) {
        dao.saveOrUpdate(autor);
    }

    @Override
    public void obrisiIzdavaca(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void izmeniIzdavaca(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void dodajIzdavaca(Izdavac izdavac) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void obrisiJezik(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void dodajJezik(Jezik jezik) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void izmeniJezik(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void obrisiKnjigu(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void izmeniKnjigu(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void dodajKnjigu(Knjiga knjiga) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void obrisiOblast(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void izmeniOblast(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void dodajOblast(Oblast oblast) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void obrisiOsobu(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void izmeniOsobu(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void dodajOsobu(Osoba osoba) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void obrisiPublikaciju(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void izmeniPublikaciju(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void dodajPublikaciju(Publikacija publikacija) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void obrisiStudenta(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void izmeniStudenta(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void dodajStudenta(Student student) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void obrisiZaduzenje(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void izmeniZaduzenje(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void dodajZaduzenje(Zaduzenja zaduzenja) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void obrisiZaposleni(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void izmeniZaposleni(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void dodajZaposleni(Zaposleni zaposleni) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void obrisiBibliotekara(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void izmeniBibliotekara(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void dodajBibliotekara(ZaposleniBibliotekar zaposleniBibliotekar) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
