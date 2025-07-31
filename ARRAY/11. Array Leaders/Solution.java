import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {

    static ArrayList<Integer> leaders(int arr[]) {
        // code here

        ArrayList<Integer> newList = new ArrayList<>();
        int n = arr.length;
        int max = arr[n - 1];

        for (int i = n - 1; i >= 0; i--) {
            if (max <= arr[i]) {
                max = arr[i];
                newList.add(max);
            }
        }
        Collections.reverse(newList);
        return newList;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 16, 17, 4, 3, 5, 2 };
        System.out.println(leaders(arr));
    }
}