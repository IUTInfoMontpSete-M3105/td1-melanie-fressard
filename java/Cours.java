
import java.util.*;

/**
 * 
 */
public class Cours {

    /**
     * Default constructor
     */
    public Cours(String n, int s) {
    nom = n;
    semestre = s;
    }

    /**
     * 
     */
    private String nom;

    /**
     * 
     */
    private int semestre;






    /**
     * @param doc
     */
    public void UploadDoc(String doc) {
        System.out.println("j'upload un doc");
    }

    /**
     * @param ens
     */
    public void informerEns(Enseignant ens) {
        System.out.println("l'enseignant " + ens " est attribué au cours");
    }

    /**
     * @param note
     */
    public void informerEtud(int note) {
        System.out.println("Voici votre note : " + note);
    }

    /**
     * @param note
     */
    public void notification(int note) {
        System.out.println("Vous avez reçu une nouvelle note : " + note);
    }

}
