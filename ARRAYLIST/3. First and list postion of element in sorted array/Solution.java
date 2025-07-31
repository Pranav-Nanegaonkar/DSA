import java.util.Arrays;

public class Solution {
    public static int[] searchRange(int[] nums, int target) {
        int lastIdx = -1;
        int firstIdx = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                firstIdx = i;
                break;
            }
        }
        if (firstIdx == -1) {
            return new int[] { -1, -1 };
        }
        for (int j = firstIdx; j < nums.length; j++) {
            if (nums[j] == target) {
                lastIdx = j;
            }
        }
        return new int[] { firstIdx, lastIdx };
    }

    public static void main(String[] args) {
        int[] strem = { 10, 4, 5 };

        System.out.println(Arrays.toString(strem));
        System.out.println(Arrays.toString(searchRange(strem, 2)));
    }
}
