import java.util.HashMap;
import java.util.Map;

/*
Map
    - Stores key value pairs
    HashMap
        - unordered keys
    TreeMap
        - keys ordered in Ascending order
    LinkedHashMap
        - keys ordered in insertion order
 */
public class Main {
    public static void main(String[] args) {
        
        // HashMap
        Map<String, String> map = new HashMap<>();
        map.put("name", "Navin");
        map.put("actor", "John");
        map.put("CEO", "Marisa");

        System.out.println(map);
        System.out.println(map.get("name"));
        System.out.println(map.get(""));        // returns null
        System.out.println(map.get("random"));  // returns null

        map.keySet().forEach(key -> System.out.println(key + ": " + map.get(key)));
    }
}
