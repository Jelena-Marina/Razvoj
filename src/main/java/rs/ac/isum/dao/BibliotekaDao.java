/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rs.ac.isum.dao;

import java.util.List;
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
public interface BibliotekaDao {
    
    public abstract List<Autor> sviAutori();
    public abstract void obrisiAutora();
    
    public abstract List<Izdavac> sviIzdavaci();
    
    public abstract List<Jezik> sviJezici();
    
    public abstract List<Knjiga> sveKnjige();
    
    public abstract List<Oblast> sveOblaste();
    
    public abstract List<Osoba> sveOsobe();
    
    public abstract List<Publikacija> svePublikacija();
    
    public abstract List<Student> sviStudenti();
    
    public abstract List<Zaduzenja> svaZaduzenja();
    
    public abstract List<Zaposleni> sviZaposleni();
    
    public abstract List<ZaposleniBibliotekar> sviBibliotekari();
}
