/**
 * Created by Stephane on 16/05/2017.
 */
public class Site {
    private Library my_lib;

    public Library getMy_lib() {
        return my_lib;
    }

    public void setMy_lib(Library my_lib) {
        this.my_lib = my_lib;
    }

    public Site(Library my_lib) {

        this.my_lib = my_lib;
    }
    public void buy(Livre livre){
        my_lib.add_library(livre);
    }
    public void exchange(Livre l1,Livre l2) {
        boolean ok=my_lib.getLibrary().contains(l1);
        if ((l1.getPrix() == l2.getPrix()) && ok ) {
            my_lib.getLibrary().remove(l1);
            my_lib.getLibrary().add(l2);
            System.out.println("Echange fait");
        }
        else if((l1.getPrix() != l2.getPrix() || !ok )){
            System.out.println("Echange impossible");
        }
    }
    public void sell(Livre livre){
        boolean ok=my_lib.getLibrary().contains(livre);
        if (ok){
            my_lib.getLibrary().remove(livre);
            System.out.println("Livre vendu");
        }
        else{
            System.out.println("Vente impossible");
        }
    }
}
