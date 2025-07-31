public class Solution {
    static int diagonalSum(int[][] arr) {
        int sum = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i][i];
            sum = sum + arr[i][n - i - 1];
        }
        if (n % 2 != 0) {
            int index = arr.length / 2;
            sum = sum - arr[index][index];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] arr = new int[][] {
                { 7, 3, 1, 9 },
                { 3, 4, 6, 9 },
                { 6, 9, 6, 6 },
                { 9, 5, 8, 5 }
        };
        System.out.println(diagonalSum(arr));
    }
}
