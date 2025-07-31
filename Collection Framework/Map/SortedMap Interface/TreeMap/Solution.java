import java.util.SortedMap;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) {
        SortedMap<Integer, String> map = new TreeMap<>();
        map.put(99, "Zen");
        map.put(50, "Miller");
        map.put(1, "kapur");
        map.put(29, "Bukshi");
        map.put(49, "Patel");
        System.out.println(map);

        System.out.println(map.headMap(49));
        System.out.println(map.tailMap(49));
        System.out.println(map.subMap(29, 99));
    }
}
