
/**
 * Created by Stephane on 16/05/2017.
 */
public class Livre {
    protected String titre;
    protected String auteur;
    protected double prix;
    protected int nb_pages;

    public Livre(String titre, String auteur, double prix, int nb_pages) {
        this.titre = titre;
        this.auteur = auteur;
        this.prix = prix;
        this.nb_pages = nb_pages;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public int getNb_pages() {
        return nb_pages;
    }

    public void setNb_pages(int nb_pages) {
        this.nb_pages = nb_pages;
    }

    public boolean exchange(int p1,int p2){
        boolean T=true;
        if (p1==p2)
            T=true;
        else
            T=false;
        return T;
    }

    @Override
    public String toString() {
        return "Livre{" +
                "titre='" + titre + '\'' +
                ", auteur='" + auteur + '\'' +
                ", prix=" + prix +
                ", nb_pages=" + nb_pages +
                '}';
    }
}
