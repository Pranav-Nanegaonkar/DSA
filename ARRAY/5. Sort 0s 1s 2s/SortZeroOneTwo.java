import java.util.Arrays;

public class SortZeroOneTwo {
    public static void sortArr(int[] arr) {
        int left = 0, right = arr.length - 1, current = 0;
        int temp = 0;
        while (current < right) {
            if (arr[current] == 0) {
                temp = arr[left];
                arr[left] = arr[current];
                arr[current] = temp;
                current++;
                left++;
            } else if (arr[current] == 2) {
                temp = arr[right];
                arr[right] = arr[current];
                arr[current] = temp;
                right--;
            } else {
                current++;
            }

        }
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 1, 0, 1, 2, 2, 0, 1, 0, 1, 1, 1, 2, 2, 2 };
        System.out.print(Arrays.toString(arr) + "\n");
        sortArr(arr);
        System.out.print(Arrays.toString(arr));
    }
}
