public class PairSum_2 {
    public static int findPairs(int[] arr, int target) {
        int start = 0, count = 0, end = arr.length - 1;

        while (start < end) {
            int sum = arr[start] + arr[end];
            if (sum == target) {
                count++;
                start++;
                end--;
            } else if (sum > target) {
                end--;
            } else {
                start++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 10, 20, 30, 40, 50 };// 4,6,8,9,10,14 = 7 // 1,2,3,4,5 = 6
        System.out.println("Result: " + findPairs(arr, 30));
    }
}
