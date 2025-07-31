import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class Solution {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Orange", 10);
        map.put("Apple", 30);
        map.put("Mango", 20);
        // linkedmap.put("Orange", 10);
        // linkedmap.put("Apple", 30);
        // linkedmap.put("Mango", 20);

        LinkedHashMap<String, Integer> linkedmap = new LinkedHashMap<>(map);

        System.out.println("HashMap:");
        for (Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println("LinkedHashMap:");
        for (Entry<String, Integer> entry : linkedmap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println(linkedmap);
    }
}
