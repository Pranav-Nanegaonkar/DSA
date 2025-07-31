import java.util.Arrays;

public class PairOfAltElement_2 {

    public static void swapAllPairOfAlternateElements(int[] arr) {

        for (int i = 0; i < arr.length - 1; i = i + 2) {
            int temp;
            temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 9, 3, 6, 12, 4, 32 };// 8,3,4,9,2,5,6,7,9 // 9, 3, 6, 12, 4, 32

        System.out.println(Arrays.toString(arr));
        swapAllPairOfAlternateElements(arr);
        System.out.println(Arrays.toString(arr));

    }
}