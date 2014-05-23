package rs.ac.isum.pages;

import java.util.ArrayList;
import java.util.List;
import org.apache.tapestry5.ioc.annotations.Inject;
import rs.ac.isum.dao.BibliotekaDao;
import rs.ac.isum.entities.Autor;

public class About
{
    @Inject
    private BibliotekaDao bibl;
    
    void onActivate(){
        
        List<Autor> test = new ArrayList<Autor>();
        test = bibl.sviAutori();
        
        while (!test.isEmpty()){
            System.out.println("<Pocetak novog entiteta>");
            System.out.println("Ime autora:" + test.get(0).getBaIme());
            System.out.println("Prezime autora:" + test.get(0).getBaPrezime());
            System.out.println("<Kraj entiteta>");
            test.remove(0);
            
        }
    }

}
