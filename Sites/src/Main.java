/**
 * Created by Stephane on 16/05/2017.
 */
public class Main {
    public static void main(String[] args) {
        Livre livre1= new BD("Tintin","Hergé",15,150,false);
        Livre livre2= new SF("Morron","Vic",15,250);
        Library my_lib= new Library();
        Site compte1=new Site(my_lib);
        my_lib.add_library(livre1);
        System.out.println(my_lib);

        compte1.exchange(livre1,livre2);
        System.out.println(my_lib);
    }
}
