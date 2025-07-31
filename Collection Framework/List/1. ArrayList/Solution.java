import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(3);
        System.out.println(list);
        // list.remove(1); // remove element at index 1
        // list.remove(Integer.valueOf(1)); // remove Object that have value 1
        System.out.println(list);
        System.out.println(list.contains(2));
        ; // check that element are in the list or not

        Object[] ob = list.toArray();
        System.out.println(Arrays.toString(ob));
        Integer[] arr = list.toArray(new Integer[0]);
        System.out.println(Arrays.toString(arr));

        // Collections.sort(list);
        list.sort(null);
        System.out.println(list);
    }
}
