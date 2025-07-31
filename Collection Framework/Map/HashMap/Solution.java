import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(21, "Pranav");
        map.put(52, "Omkar");
        map.put(3, "Sushant");
        System.out.println(map);
        String student = map.get(21);
        System.out.println(student);

        boolean key = map.containsKey(3); // true
        System.out.println(key);

        boolean val = map.containsValue("Omkar"); // true
        System.out.println(val);

        Set<Integer> set = map.keySet();
        System.out.println(set);
        for (int set2 : set) {
            // System.out.println(map.get((Object) set2)); // or instead make the set2 to
            // int
            System.out.println(map.get(set2));
        }
        // or directly
        for (int item : map.keySet()) {
            System.out.println(map.get(item));
        }
        // also
        for (String item : map.values()) {
            System.out.println(item);
        }
        for (Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
            // also we can modify
            entry.setValue(entry.getValue().toUpperCase());
        }
        System.out.println(map);
        // map.put(null, "kkk");
        System.out.println(map);
        for (int item : map.keySet()) {
            System.out.println(item);
        }
    }
}
