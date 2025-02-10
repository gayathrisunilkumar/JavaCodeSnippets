public class Subsequence {
    public static boolean isSubsequence(String s, String t) {

        int i=0;
        int j=0;

        while (i < s.length() && j < t.length()) {
            if (t.charAt(j) == s.charAt(i)) {
                i++;
            } else {
                i=0;
            }
            j++;
        }

        if (i == s.length()) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "gat";
        String t = "gayathri";
        boolean isSubsequence = isSubsequence(s, t);
        System.out.println(isSubsequence);
    }
}


