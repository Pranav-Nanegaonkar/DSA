public class CandyCrush {

    // not optimized O(n^2)
    static StringBuffer reduceCandy_(String str) {
        StringBuffer newStr = new StringBuffer(str);
        while (true) {
            int flag = 0;
            for (int i = 1; i < newStr.length();) {
                if (newStr.charAt(i - 1) == newStr.charAt(i)) {
                    newStr.delete(i - 1, i + 1);
                    flag++;
                }
                i++;
            }
            if (flag == 0) {
                break;
            }
        }
        return newStr;
    }

    // optimized
    static StringBuffer reduceCandy(String str) {
        StringBuffer newStr = new StringBuffer(str);
        int i = 0;
        while (i < newStr.length() - 1) {
            char ch1 = newStr.charAt(i);
            char ch2 = newStr.charAt(i + 1);
            if (ch1 == ch2) {
                newStr.delete(i, i + 2);
                if (i != 0) {
                    i--;
                }
                continue;
            }
            i++;
        }
        return newStr;
    }

    public static void main(String[] args) {
        System.out.println(reduceCandy("googleggeod"));
    }
}
