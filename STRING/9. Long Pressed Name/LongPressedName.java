public class LongPressedName {
    static boolean isLongPressedName(String name, String typed) {
        if (name.length() > typed.length()) {
            return false;
        }
        int i = 0, j = 0;
        while (i < name.length() && j < typed.length()) {
            char ch1 = name.charAt(i);
            char ch2 = typed.charAt(j);
            if (ch1 == ch2) {
                i++;
                j++;
            } else if (i > 0 && name.charAt(i - 1) == ch2) {
                j++;
            } else {
                return false;
            }
        }
        if (name.length() == typed.length()) {
            return true;
        } else if (name.length() < typed.length()) {
            for (int k = j; k < typed.length(); k++) {
                if (name.charAt(i - 1) != typed.charAt(k)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String name = "alex";
        String typed = "aallleeeex";
        System.out.println(isLongPressedName(name.toLowerCase(), typed.toLowerCase()));
    }
}
