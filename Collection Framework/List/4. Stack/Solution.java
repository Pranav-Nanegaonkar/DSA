import java.util.LinkedList;
import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack);
        Integer removedInt = stack.pop();
        System.out.println(removedInt);
        System.out.println(stack);
        Integer top = stack.peek();
        System.out.println(top);
        stack.addFirst(9);
        System.out.println(stack);
        int search = stack.search(2);// 3
        // 4 1
        // 3 2
        // 2 3
        // 1 4
        // 9 5
        System.out.println(search);

        // Linkedlist as stack
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.addLast(1);
        linkedList.addLast(2);
        linkedList.addLast(3);
        linkedList.getLast();
        linkedList.removeLast();
    }
}
