import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long N = sc.nextLong(); // Initial subscribers
        long H = sc.nextLong(); // Half-life
        int Q = sc.nextInt(); // Number of queries

        for (int i = 0; i < Q; i++) {
            long t = sc.nextLong();

            long k = t / H; // Number of halvings

            // Use Math.pow to calculate 2^k, then divide N by that
            double power = Math.pow(2, k);
            long remaining = (long) (N / power);

            System.out.println(remaining);
        }
    }
}
