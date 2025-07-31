import java.util.Arrays;
import java.util.LinkedList;
import java.util.Vector;

public class Solution {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 6));

        // ArrayList<Integer> arrList = new ArrayList<>(Arrays.asList(1, 23, 4));

        Vector<Integer> vec = new Vector<>(list);
        System.out.println(vec);

        // same methods as List
    }
}
