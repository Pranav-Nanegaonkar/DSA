

public class ExpandString {

    static StringBuffer output(String str) {

        StringBuffer output = new StringBuffer();
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            int x = arr[i] - '0';
            int j = i + 2;
            StringBuffer temp = new StringBuffer();
            while (arr[j] != ')') {
                temp.append(arr[j]);
                j++;
            }
            for (int k = 0; k < x; k++) {
                output.append(temp);
            }
            i = j;
        }
        return output;
    }

    public static void main(String[] args) {
        StringBuffer str = new StringBuffer(output("0(a)3(b)3(c)"));
        System.out.println(str.toString());
    }
}
