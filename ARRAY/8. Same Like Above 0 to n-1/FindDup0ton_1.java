import java.util.Arrays;

public class FindDup0ton_1 {

    public static void findDup(int[] arr) {
        int length = arr.length;
        for (int i = 0; i < arr.length; i++) {
            int x = arr[i] % length;
            arr[x] = arr[x] + length;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] / length >= 2) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 4, 3, 2, 5, 0, 0, 1, 7, 2, 3, 1, 7 };
        System.out.println(Arrays.toString(arr));
        System.out.print("Result: ");
        findDup(arr);
    }
}