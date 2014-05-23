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

    //sve funkcionalnosti za autora
    public abstract List<Autor> sviAutori();

    public abstract void obrisiAutora(long id);

    public abstract void izmeniAutora(long id);

    public abstract void dodajAutora(Autor autor);

    //sve funkcionalnosti za izdavaca
    public abstract List<Izdavac> sviIzdavaci();

    public abstract void obrisiIzdavaca(long id);

    public abstract void izmeniIzdavaca(long id);

    public abstract void dodajIzdavaca(Izdavac izdavac);

    //sve funkcionalnosti za jezike
    public abstract List<Jezik> sviJezici();
    public abstract void obrisiJezik(long id);
    public abstract void dodajJezik(Jezik jezik);
    public abstract void izmeniJezik(long id);
    
    //sve funkcionalnosti za knjige
    public abstract List<Knjiga> sveKnjige();
    public abstract void obrisiKnjigu(long id);
    public abstract void izmeniKnjigu(long id);
    public abstract void dodajKnjigu(Knjiga knjiga);
    
    //sve funkcionalnosti za oblasti
    public abstract List<Oblast> sveOblaste();
    public abstract void obrisiOblast(long id);
    public abstract void izmeniOblast(long id);
    public abstract void dodajOblast(Oblast oblast);

    //sve funkcionalnosti za osobe
    public abstract List<Osoba> sveOsobe();
    public abstract void obrisiOsobu(long id);
    public abstract void izmeniOsobu(long id);
    public abstract void dodajOsobu(Osoba osoba);
    //sve funkcionalnosti za publikacije
    public abstract List<Publikacija> svePublikacija();
    public abstract void obrisiPublikaciju(long id);
    public abstract void izmeniPublikaciju(long id);
    public abstract void dodajPublikaciju(Publikacija publikacija);
    //sve funkcionalnosti za studente
    public abstract List<Student> sviStudenti();
    public abstract void obrisiStudenta(long id);
    public abstract void izmeniStudenta(long id);
    public abstract void dodajStudenta(Student student);
    //sve funkcionalnosti za zaduzenja
    public abstract List<Zaduzenja> svaZaduzenja();
    public abstract void obrisiZaduzenje(long id);
    public abstract void izmeniZaduzenje(long id);
    public abstract void dodajZaduzenje(Zaduzenja zaduzenja);
    //sve funkcionalnosti za zaposlene
    public abstract List<Zaposleni> sviZaposleni();
    public abstract void obrisiZaposleni(long id);
    public abstract void izmeniZaposleni(long id);
    public abstract void dodajZaposleni(Zaposleni zaposleni);
    //sve funckionalnosti za biblitekare
    public abstract List<ZaposleniBibliotekar> sviBibliotekari();
    public abstract void obrisiBibliotekara(long id);
    public abstract void izmeniBibliotekara(long id);
    public abstract void dodajBibliotekara(ZaposleniBibliotekar zaposleniBibliotekar);
}
