public class ReverseWords {

    public static String reverseWords(String s) {
        StringBuffer str = new StringBuffer(s);
        str.reverse();
        StringBuffer output = new StringBuffer();
        int n = str.length();

        for (int i = 0; i < n; i++) {
            StringBuffer word = new StringBuffer();
            while (i < n && str.charAt(i) != '.') {
                word.append(str.charAt(i));
                i++;
            }
            word.reverse();
            if (word.length() > 0) {
                output.append('.');
                output.append(word);

            }
        }
        return output.substring(1);
    }

    public static void main(String[] args) {
        String str = "the...quick...brown......fox.jumps........over.the............lazy.dog";
        System.out.println(str);
        System.out.println(reverseWords(str));
    }
}
