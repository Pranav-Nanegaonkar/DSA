public class CheckPermutation {

    /*
     * // not correct and optimal solution!!
     * static boolean checkPer(String str1, String str2) {
     * int count = 0;
     * if (str1.length() == str2.length()) {
     * for (int i = 0; i < str1.length(); i++) {
     * for (int j = 0; j < str2.length(); j++) {
     * if (str1.charAt(i) == str2.charAt(j)) {
     * count++;
     * }
     * }
     * }
     * }
     * System.out.println(count);
     * if (count == str1.length()) {
     * return true;
     * }
     * return false;
     * }
     */

    // Optimal and Correct Solution by using ASCI VALUE array.
    static boolean checkPer(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }
        int[] arr = new int[256];
        for (int i = 0; i < str1.length(); i++) {
            int x = str1.charAt(i);
            arr[x]++;
        }
        for (int i = 0; i < str2.length(); i++) {
            int x = str2.charAt(i);
            arr[x]--;
        }
        for (int x : arr) {
            if (x != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println(checkPer("pranav", "prnaav"));

    }
}
