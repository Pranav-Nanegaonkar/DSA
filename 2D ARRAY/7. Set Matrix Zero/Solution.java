public class Solution {
    static void setMatrixZero(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        boolean setCol0 = false;
        for (int i = 0; i < rows; i++) {
            if (matrix[i][0] == 0) {
                setCol0 = true;
            }
            for (int j = 1; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        // printMatrix(matrix);
        for (int i = rows - 1; i >= 0; i--) {
            for (int j = cols - 1; j > 0; j--) {
                int left = matrix[i][0];
                int top = matrix[0][j];
                if (left == 0 || top == 0) {
                    matrix[i][j] = 0;
                }
            }
            if (setCol0) {
                matrix[i][0] = 0;
            }
        }
    }

    static void printMatrix(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][] {
                { 0, 0, 2, 3, 9 },
                { 7, 4, 5, 7, 7 },
                { 1, 2, 3, 0, 0 }
        };
        printMatrix(matrix);
        setMatrixZero(matrix);
        System.out.println();
        printMatrix(matrix);
    }
}
