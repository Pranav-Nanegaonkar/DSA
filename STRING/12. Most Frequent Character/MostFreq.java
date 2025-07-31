
public class MostFreq {

    public static char getMaxOccuringChar(String s) {
        // Your code here
        int[] arr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            int x = s.charAt(i);
            int index = x - 'a';
            arr[index]++;
        }
        int max = Integer.MIN_VALUE;
        int returnIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                returnIndex = i;
            }
        }
        char newele = (char) (returnIndex + 'a');
        return newele;
    }

    public static void main(String[] args) {
        String str = "uakuau";
        System.out.println(getMaxOccuringChar(str));
    }
}
