import java.util.Arrays;

public class ArrayRotation_BruteF {

    static void rotateOnce(int[] arr) {
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = temp;
    }

    static void rotateKTimes(int[] arr, int k) {
        k = k % arr.length;
        if (k < 0) {
            k = k + arr.length;
        }
        for (int i = 1; i <= k; i++) {
            rotateOnce(arr);
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3, 4, 5 };
        System.out.println(Arrays.toString(arr));
        rotateKTimes(arr, 2);
        System.out.println(Arrays.toString(arr));
    }
}