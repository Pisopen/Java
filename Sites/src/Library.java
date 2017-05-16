import java.util.ArrayList;
import java.util.List;

/**
 * Created by Stephane on 16/05/2017.
 */
public class Library {
    private Livre livre;
    private List<String> library=new ArrayList<String>();

    public void add_library(Livre livre){
        library.add(livre.getTitre());
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

    public List<String> getLibrary() {
        return library;
    }

    public void setLibrary(List<String> library) {
        this.library = library;
    }

    @Override
    public String toString() {
        return "My Library{"+ library +
                '}';
    }
}
