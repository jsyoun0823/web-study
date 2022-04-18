import java.util.ArrayList;
import java.util.List;

public class AFactory implements Aclass{

    public static List<Aclass> createA() {
        return new ArrayList<>();
    }
}
