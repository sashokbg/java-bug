import java.util.List;

/**
 * Created by kirilov_a on 12/04/2016.
 */
public abstract class AbstractService<AbstractModel> {
    private List<Long> listOfLongs;

    public List<Long> getListOfLongs(){
        return listOfLongs;
    }
}
