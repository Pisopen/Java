import java.util.ArrayList;
import java.util.List;

/**
 * Created by Stephane on 16/05/2017.
 */
public class Library {
    private Livre livre;
    private List<Livre> library=new ArrayList<Livre>();

    public void add_library(Livre livre){
        library.add(livre);
    }

    public Library() {
        this.livre = livre;
        this.library = library;
    }

    public Livre getLivre() {
        return livre;
    }

    public void setLivre(Livre livre) {
        this.livre = livre;
    }

    public List<Livre> getLibrary() {
        return library;
    }

    public void setLibrary(List<Livre> library) {
        this.library = library;
    }

    public Livre get_livre(int i){
        return library.get(i);
    }

    @Override
    public String toString() {
        return "My Library{"+ library +
                '}';
    }
}
