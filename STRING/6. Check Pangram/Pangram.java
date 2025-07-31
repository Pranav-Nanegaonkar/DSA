public class Pangram {
    static boolean checkPangram_(String str) {
        str = str.toLowerCase();
        int[] arr = new int[256];
        for (int i = 0; i < str.length(); i++) {
            int x = str.charAt(i);
            arr[x]++;
        }
        for (int i = 97; i <= 122; i++) {
            if (arr[i] == 0) {
                return false;
            }
        }
        return true;
    }

    // optimized
    static boolean checkPangram(String str) {
        boolean[] arr = new boolean[26];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int index;
            if (ch >= 'A' && ch <= 'Z') {
                index = ch - 'A';
            } else if (ch >= 'a' && ch <= 'z') {
                index = ch - 'a';
            } else {
                continue;
            }
            arr[index] = true;
        }
        for (boolean x : arr) {
            if (x == false) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog";
        System.out.println(checkPangram(str)); 
    }
}
