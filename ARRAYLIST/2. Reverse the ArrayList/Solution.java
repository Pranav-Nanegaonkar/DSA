import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void reverseArrayList(List<Integer> arr, int m) {
        int left = m + 1;
        int right = arr.size() - 1;
        while (left < right) {
            int temp = arr.set(left, arr.get(right));
            arr.set(right, temp);
            left++;
            right--;
        }
        System.out.println(arr);
    }

    public static void main(String[] args) {
        int[] strem = { 10, 4, 5, 2, 3, 6, 1, 3, 6 };
        List<Integer> arr = new ArrayList<>();
        for (int strem2 : strem) {
            arr.add(strem2);
        }
        System.out.println(arr);
        reverseArrayList(arr, 2);
        
    }
}
