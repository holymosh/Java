import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Created by дшшр on 08.04.2017.
 */
public class Parents {
    private static Parents ourInstance = new Parents();

    public static Parents getInstance() {
        return ourInstance;
    }

    private Parents() {
        parents = new ArrayList<>();
    }

    private List<Parent> parents;

    public Optional<Parent> getParent(int id){
        return parents.stream().filter(parent -> parent.getId() == id).findFirst();
    }

}
