/**
 * Created by Stephane on 16/05/2017.
 */
public class BD extends Livre {
    private boolean colored;
    public BD(String titre, String auteur, double prix, int nb_pages, boolean colored) {
        super(titre, auteur, prix, nb_pages);
        this.colored = colored;
    }

    @Override
    public String toString() {
        if (colored==true){
            return "BD{" +
                "titre='" + titre + '\'' +
                ", auteur='" + auteur + '\'' +
                ", prix=" + prix +" €"+
                ", nb_pages=" + nb_pages +
                ", Vous pouvez le colorier.}";}
        else{
            return "BD{" +
                "titre='" + titre + '\'' +
                ", auteur='" + auteur + '\'' +
                ", prix=" + prix +" €"+
                ", nb_pages=" + nb_pages +
                ", A ne pas colorier SVP.}"; }
    }
}
