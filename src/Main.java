import java.util.List;

/**
 * Created by kirilov_a on 12/04/2016.
 */
public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        ConcreteService cl = new ConcreteService();
        m.test(cl);

    }

    public void test(AbstractService service){
        List<Long> list = service.getListOfLongs();
        /**
         * This does not work. Javac complains that the reaquired type is Object, even though getListOfLongs returns List<Long>
         */
        for(Long l :  service.getListOfLongs()){

        }

        /**
         * This on the other hands works ..
         */
        for(Long l :  list){

        }
    }
}
