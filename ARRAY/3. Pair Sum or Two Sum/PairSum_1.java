public class PairSum_1 {
    public static int findPairs(int[] arr, int target) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3, 4, 5 };// 4,6,8,9,10,14 = 7 // 1,2,3,4,5 = 6
        System.out.println("Result: " + findPairs(arr, 6));
    }
}
