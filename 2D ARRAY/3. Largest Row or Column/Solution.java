
public class Solution {
    public static void maxRoworColumn(int[][] arr) {
        int max = Integer.MIN_VALUE;
        int index = 0;
        boolean isRow = true;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            if (sum > max) {
                max = sum;
                index = i;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[j][i];
            }
            if (sum > max) {
                max = sum;
                index = i;
                isRow = false;
            }
        }
        if (isRow) {
            System.out.println("Row: " + index + " " + max);
        } else {
            System.out.println("Column: " + index + " " + max);
        }
    }

    public static void main(String[] args) {
        int[][] arr = new int[][] { { 1, 2, 3 }, { 1, 2, 3 }, { 1, 2, 3 } }; // row: 1 8
        maxRoworColumn(arr);
    }
}
