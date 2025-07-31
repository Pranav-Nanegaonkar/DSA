import java.util.Arrays;

public class PairOfAltElement_1 {

    public static void swapAllPairOfAlternateElements(int[] arr) {

        for (int i = 1; i < arr.length; i = i + 2) {
            int temp;
            temp = arr[i - 1];
            arr[i - 1] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 8, 3, 4, 9, 2, 5, 6, 7, 9 };// 8,3,4,9,2,5,6,7,9 9, 3, 6, 12, 4, 32

        System.out.println(Arrays.toString(arr));
        swapAllPairOfAlternateElements(arr);
        System.out.println(Arrays.toString(arr));

    }
}