import java.util.ArrayList;
import java.util.List;

public class Solution {

    static void printSpiralMatrix(int[][] arr) {
        int sRow = 0;
        int sCol = 0;
        int eRow = arr.length - 1;
        int eCol = arr[0].length - 1;
        int total = arr.length * arr[0].length;
        int count = 0;

        while (count < total) {
            for (int i = sCol; i <= eCol; i++) {
                System.out.print(arr[sRow][i] + " ");
                count++;
            }
            sRow++;
            for (int i = sRow; i <= eRow; i++) {
                System.out.print(arr[i][eCol] + " ");
                count++;
            }
            eCol--;
            for (int i = eCol; i >= sCol; i--) {
                System.out.print(arr[eRow][i] + " ");
                count++;
            }
            eRow--;
            for (int i = eRow; i >= sRow; i--) {
                System.out.print(arr[i][sCol] + " ");
                count++;
            }
            sCol++;
        }
        System.out.println();
    }

    static List<Integer> spiralOrder(int[][] arr) {
        int sRow = 0;
        int sCol = 0;
        int eRow = arr.length - 1;
        int eCol = arr[0].length - 1;
        int total = arr.length * arr[0].length;
        int count = 0;

        List<Integer> list = new ArrayList<>();

        while (count < total) {
            for (int i = sCol; i <= eCol; i++) {
                list.add(arr[sRow][i]);
                count++;
            }
            sRow++;
            for (int i = sRow; i <= eRow; i++) {
                list.add(arr[i][eCol]);
                count++;
            }
            eCol--;
            for (int i = eCol; i >= sCol; i--) {
                list.add(arr[eRow][i]);
                count++;
            }
            eRow--;
            for (int i = eRow; i >= sRow; i--) {
                list.add(arr[i][sCol]);
                count++;
            }
            sCol++;
        }
        return list;
    }

    public static void main(String[] args) {
        int[][] arr = new int[][] {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 },
                { 10, 11, 12 }
        };
        printSpiralMatrix(arr);
        System.out.println(spiralOrder(arr));
    }
}
