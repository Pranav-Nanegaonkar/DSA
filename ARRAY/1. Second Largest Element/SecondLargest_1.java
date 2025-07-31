import java.util.Arrays;

public class SecondLargest_1 {
    public static int findSecondLargestElement(int[] arr) {
        Arrays.sort(arr);
        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[i] != arr[i - 1]) {
                return arr[i - 1];
            }
        }
        return Integer.MIN_VALUE;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {1,2,2,2,2,2};
        int a = findSecondLargestElement(arr);
        System.out.println("Second Large NO: " + a);
    }
}