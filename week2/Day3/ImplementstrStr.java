
public class ImplementstrStr {

    public static boolean isSubsequence(String s, String t) {
        int j = 0;
        int i = 0;

        if (s.length() == 0) {
            return true;
        }

        while (i < t.length()) {
            if (s.charAt(j) == t.charAt(i)) {
                i++;
                j++;
            } else {
                i++;
            }

            if (j == s.length()) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgdc";

        boolean ans = isSubsequence(s, t);
        System.out.println(ans);
    }
}