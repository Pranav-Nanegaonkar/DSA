import java.util.Arrays;

public class Solution {
    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int[] newDigit = new int[n + 1];
        newDigit[0] = 1;
        return newDigit;
    }

    public static void main(String[] args) {
        int[] digits = new int[] { 1, 2, 3 };
        int[] arr = plusOne(digits);
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}