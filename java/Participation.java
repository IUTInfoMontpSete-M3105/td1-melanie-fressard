
import java.util.*;

/**
 * 
 */
public class Participation {

    /**
     * Default constructor
     */
    public Participation(int n, String app, String certif) {
    note = n;
    appreciation = app;
    certificat = certif;
    }

    /**
     * 
     */
    private int note;

    /**
     * 
     */
    private String appreciation;

    /**
     * 
     */
    public String certificat;


    /**
     * @param note
     */
    public void updateParticip(int note) {
        System.out.println("La note est updaté de : " + note);
    }

}
