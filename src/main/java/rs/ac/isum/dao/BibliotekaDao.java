/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rs.ac.isum.dao;

import java.util.List;
import rs.ac.isum.entities.AbstractEntity;
import rs.ac.isum.entities.Autor;
import rs.ac.isum.entities.Jezik;

/**
 *
 * @author Jelena
 */
public interface BibliotekaDao {
    
    public abstract List<Autor> sviAutori();
    public abstract void obrisiAutora();
    public abstract List<Jezik> sviJezici();
}
