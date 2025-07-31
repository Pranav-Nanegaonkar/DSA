import java.util.Arrays;

public class SortZeroAndOne {
    public static void sortArr(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            if (arr[start] != 1) {
                start++;
            } else if (arr[end] != 0) {
                end--;
            } else {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 1, 0, 1, 0, 1, 0, 1, 1, 1 };
        System.out.print(Arrays.toString(arr) + "\n");
        sortArr(arr);
        System.out.print(Arrays.toString(arr));
    }
}
