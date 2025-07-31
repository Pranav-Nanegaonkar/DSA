import java.util.Scanner;

public class Solution {
    public static int minRepeats(String s1, String s2) {
        StringBuilder repeated = new StringBuilder();
        int count = 0;

        while (repeated.length() < s2.length()) {
            repeated.append(s1);
            count++;
        }

        if (repeated.indexOf(s2) != -1) {
            return count;
        }
        repeated.append(s1);
        count++;
        if (repeated.indexOf(s2) != -1) {
            return count;
        }
        return -1;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input strings
        System.out.print("Enter String 1 : ");
        String s1 = sc.nextLine();
        System.out.print("Enter String 2 : ");
        String s2 = sc.nextLine();

        // Output result
        System.out.println("Output: " + minRepeats(s1, s2));
    }
}
