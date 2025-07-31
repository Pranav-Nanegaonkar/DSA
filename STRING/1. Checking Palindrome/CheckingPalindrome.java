public class CheckingPalindrome {

    static boolean checkPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "aaba";
        System.out.println(str.toString());
        System.out.println(checkPalindrome(str));
    }
}