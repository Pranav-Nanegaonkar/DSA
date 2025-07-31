import java.util.Arrays;

public class Operations {
    static int finalValue(String[] arr) {
        int x = 0;
        for (String str : arr) {
            if (str.equalsIgnoreCase("++x") || str.equalsIgnoreCase("x++")) {
                x++;
            } else {
                x--;
            }
        }
        return x;
    }

    public static void main(String[] args) {
        String[] arr = new String[] { "++X", "x++", "x++" };
        System.out.println(Arrays.toString(arr));
        System.out.println(finalValue(arr));
    }
}
