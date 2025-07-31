import java.util.Arrays;

public class ContainerWithMostWater {
    // brute force
    public static int maxWater(int[] arr) {
        int maxArea = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                int minHight = Math.min(arr[i], arr[j]);
                int width = j - i;
                int area = minHight * width;
                maxArea = Math.max(maxArea, area);
            }
        }

        return maxArea;
    }

    public static int maxWater_2(int[] arr) {
        int container, temp;
        container = temp = 0;
        int i = 0, j = i + 1;
        // same brute force
        while (i < j) {
            temp = Math.min(arr[i], arr[j]) * (j - i);
            if (container < temp) {
                container = temp;
            }
            j++;
            if (j == arr.length) {
                i++;
                j = i + 1;
                if (i == arr.length - 1) {
                    break;
                }
            }
        }

        return container;
    }

    // two pointer left-right
    public static int maxWater_3(int[] arr) {
        int left = 0, right = arr.length - 1;
        int maxArea = 0;
        while (left < right) {
            int max = Math.min(arr[left], arr[right]) * (right - left);
            maxArea = Math.max(maxArea, max);
            if (arr[left] < arr[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 3, 1, 3, 4, 1, 2, 3 };
        System.out.println(Arrays.toString(arr));
        System.out.println("Result: " + maxWater_3(arr));

    }
}