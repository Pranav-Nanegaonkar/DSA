import java.util.Arrays;
import java.util.LinkedList;

public class Solution {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        list.addFirst(0);
        list.addLast(4);
        System.out.println(list);
        // list.remove(); // removes first element
        // list.removeFirst();// also remove first element
        // list.removeLast();// removes last element
        // System.out.println(list);
        list.removeIf(x -> x % 2 != 0); // removes odd elements
        System.out.println(list);

        LinkedList<Integer> list2 = new LinkedList<>(Arrays.asList(1, 2, 3, 43, 242435, 3535));
        System.out.println(list2);
    }
}
