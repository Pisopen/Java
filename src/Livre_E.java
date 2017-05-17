/**
 * Created by Stephane on 16/05/2017.
 */
public class Livre_E extends Livre {
    public Livre_E(String titre, String auteur, double prix, int nb_pages) {
        super(titre, auteur, prix, nb_pages);
    }

    @Override
    public String toString() {
        return /*"Livre_Enfant{" +
                "titre='" + */titre/* + '\'' +
                ", auteur='" + auteur + '\'' +
                ", prix=" + prix +" €"+
                ", nb_pages=" + nb_pages +
                '}'*/;
    }
}
