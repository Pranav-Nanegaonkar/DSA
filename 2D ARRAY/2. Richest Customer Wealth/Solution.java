import java.util.Arrays;

public class Solution {
    static int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++){
                sum += accounts[i][j];
            }
            if (sum > max) {
                max = sum; 
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[][] arr = new int[][] { { 1, 2, 3, 1 }, { 3, 2, 1 }, { 10 } };
        System.out.println(Arrays.toString(arr));
        System.out.println(maximumWealth(arr));
    }
}
