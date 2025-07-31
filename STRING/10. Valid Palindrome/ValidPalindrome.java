public class ValidPalindrome {

    static boolean isPalindrome_(String str) {
        str = str.toLowerCase();
        StringBuffer newStr = new StringBuffer();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z' || str.charAt(i) >= '0' && str.charAt(i) < '9') {
                newStr.append(str.charAt(i));
            }
        }
        int left = 0, right = newStr.length() - 1;
        while (left < right) {
            if (newStr.charAt(left) != newStr.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    static boolean isPalindrome(String str) {
        StringBuffer newStr = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetterOrDigit(str.charAt(i))) {
                char ch = str.charAt(i);
                if (Character.isUpperCase(ch)) {
                    ch = (char) (ch + 32);
                }
                newStr.append(ch);
            }
        }
        int left = 0, right = newStr.length() - 1;
        while (left < right) {
            if (newStr.charAt(left) != newStr.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        String str = "Race a car";
        System.out.println(str);
        System.out.println();
        System.out.println(isPalindrome(str));
    }
}