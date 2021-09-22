
import java.util.*;

/**
 * 
 */
public abstract class Utilisateur {

    /**
     * Default constructor
     */
    public Utilisateur(String n, String p, String ad, String m) {
    nom = n;
    prenom = p;
    adresse = ad;
    mail = m;
    }

    /**
     * 
     */
    private String nom;

    /**
     * 
     */
    private String prenom;

    /**
     * 
     */
    private String adresse;

    /**
     * 
     */
    private String mail;

}
