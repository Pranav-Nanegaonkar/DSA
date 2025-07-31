import java.util.Arrays;

public class Solution {
    public static void rotateMatrix(int[][] matrix) {
        swapRows(matrix);
        // System.out.println(Arrays.toString(matrix[0]));
        // System.out.println(Arrays.toString(matrix[1]));
        // System.out.println(Arrays.toString(matrix[2]));
        // System.out.println(Arrays.toString(matrix[3]));
        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = matrix.length - 1; j >= 1 + i; j--) {

                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;

            }
        }
    }

    public static void swapRows(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n / 2; i++) {
            int[] temp = matrix[i];
            matrix[i] = matrix[n - i - 1];
            matrix[n - i - 1] = temp;
        }
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } }; /*
                                                                                 * { { 5, 1, 9, 11 }, { 2, 4, 8, 10 }, {
                                                                                 * 13, 3, 6, 7 }, { 15, 14, 12, 16 } }
                                                                                 */
        System.out.println(Arrays.toString(matrix[0]));
        System.out.println(Arrays.toString(matrix[1]));
        System.out.println(Arrays.toString(matrix[2]));
        // System.out.println(Arrays.toString(matrix[3]));
        System.out.println();
        rotateMatrix(matrix);
        System.out.println();
        System.out.println(Arrays.toString(matrix[0]));
        System.out.println(Arrays.toString(matrix[1]));
        System.out.println(Arrays.toString(matrix[2]));
        // System.out.println(Arrays.toString(matrix[3]));
    }
}
