import java.util.Arrays;

public class DuplicateElement {
    public static int findDuplicateElement(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                return arr[i];
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 0, 3, 1, 5, 4, 3, 2 };
        System.out.print(Arrays.toString(arr) + "\n");
        System.out.println("Result: " + findDuplicateElement(arr));
    }
}
