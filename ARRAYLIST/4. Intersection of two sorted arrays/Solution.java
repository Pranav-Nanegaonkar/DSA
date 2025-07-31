import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public static int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> arr = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        if (nums1.length < nums2.length) {
            for (int x : nums2) {
                arr.add(x);
            }
            for (int i = 0; i < nums1.length; i++) {
                if (arr.indexOf(nums1[i]) != -1) {
                    output.add(nums1[i]);
                }
            }
        } else {
            for (int x : nums1) {
                arr.add(x);
            }
            for (int i = 0; i < nums2.length; i++) {
                if (arr.indexOf(nums2[i]) != -1) {
                    output.add(nums2[i]);
                }
            }
        }
        int[] newArr = new int[output.size()];
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = output.get(i);
        }
        return newArr;
    }

    public static ArrayList<Integer> getIntersection(int[] arr1, int[] arr2) {
        int i = 0, j = 0;
        ArrayList<Integer> output = new ArrayList<>();
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {
                output.add(arr1[i]);
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else {
                j++;
            }
        }

        return output;
    }

    public static void main(String[] args) {
        int[] nums1 = new int[] { 1, 2 };
        int[] nums2 = new int[] { 1, 1 };
        System.out.println(Arrays.toString(intersect(nums1, nums2)));
        System.out.println();
        System.out.println(getIntersection(nums1, nums2));
    }
}