import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("hi", 1);
        map.put("hello", 2);

        for (String key : map.keySet()) {
            int value = map.get(key);
            System.out.println("key:" + key + ", value:" + value);
        }
    }
}
