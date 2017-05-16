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
    public void exchange(Livre l1,Livre l2) {
        Livre tmp=new Livre("x","x",0,0);
        boolean ok=my_lib.getLibrary().contains(l1);
        if ((l1.getPrix() == l2.getPrix()) && ok==true ) {
            my_lib.getLibrary().remove(l1.getTitre());
            my_lib.getLibrary().add(l2.getTitre());
            System.out.println("echange fait");
        }
        else if((l1.getPrix() != l2.getPrix() || ok==false )){
            System.out.println("Echange impossible");
        }
    }
}
