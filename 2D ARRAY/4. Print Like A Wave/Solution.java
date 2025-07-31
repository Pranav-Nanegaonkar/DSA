public class Solution {
    static void printLikeWave(int[][] arr) {
        for (int j = 0; j < arr[0].length; j++) {
            if (j % 2 == 0) {
                for (int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i][j] + " ");
                }
            } else {
                for (int i = arr.length - 1; i >= 0; i--) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
    }
    public static void main(String[] args) {
        int[][] arr = new int[][] { { 1, 6, 7 }, { 2, 5, 8 }, { 3, 4, 9 } }; 
        printLikeWave(arr);
    }
}
