import java.util.Arrays;

public class AllTwiceElement {
    public static void findDuplicateElement(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int x = Math.abs(arr[i]);
            int idx = x - 1;
            if (arr[idx] > 0) {
                arr[idx] = -arr[idx];
            } else {
                System.out.print(x + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 8, 3, 2, 7, 5, 2, 3, 8 };
        System.out.print(Arrays.toString(arr) + "\n");
        System.out.println("Results: ");
        findDuplicateElement(arr);
    }
}
