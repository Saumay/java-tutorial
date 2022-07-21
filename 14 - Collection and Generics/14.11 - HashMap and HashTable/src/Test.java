/*
HashMap:
    - Introduced from Java 1.2
    - Not Synchronized: Not Thread Safe
    - FAST
    - allows one null key

HashTable"
    - Since Java 1.0 (beginning)
    - Synchronized: Thread Safe
    - SLOW
    - does not allow null key

Better Choice: HashMap

Vector is to ArrayList
HashTable is to HashMap
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("name", "Navin");
        map.put("actor", "John");
        map.put("CEO", "Marisa");

        // Ways to fetch entries from a map
        // 1) Using keySet
        Set<String> keys = map.keySet();
        keys.forEach(key -> System.out.println(key + ": " + map.get(key)));

        System.out.println();

        // 2) Using Map Entry - Entry is an interface inside Map
        Set<Map.Entry<String, String>> entries = map.entrySet();
        entries.forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
    }
}
