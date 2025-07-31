// The time complexity of this 

public class SecondLargest_2 {
    public static int findSecondLargestElement(int[] arr) {
        int max, secMax;
        max = secMax = Integer.MIN_VALUE;
        for (int x : arr) {
            if (x > max) {
                secMax = max;
                max = x;
            } else if (x > secMax && x != max) {
                secMax = x;
            }
        }
        return secMax;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { };
        System.out.println("Second Large NO: " + findSecondLargestElement(arr));
    }
}