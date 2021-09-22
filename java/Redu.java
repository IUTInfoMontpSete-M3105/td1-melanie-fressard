
import java.util.*;

/**
 * 
 */
public class Redu {

    /**
     * Default constructor
     */
    public Redu(String doc, date d, int pts) {
    document =doc ; 
    date = d;
    points = pts;
    }

    /**
     * 
     */
    private String document;

    /**
     * 
     */
    private date date;

    /**
     * 
     */
    private int points;




    /**
     * @param doc
     */
    public void setDocuments(String doc) {
        document = doc;
    }

    /**
     * @param ens
     */
    public void affecterEns(Enseignant ens) {
       System.out.println("j'ai affecté : "+ens);
    }

    /**
     * 
     */
    public String getDoc() {
        return document;
    }

    /**
     * @param note
     */
    public void setNote(int note) {
        points = note;
    }

}
