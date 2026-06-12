
public class RepeatedSubstringPattern {

    public static boolean repeatedSubstringPattern(String s) {
        int n = s.length();

        for (int l = 1; l <= n / 2; l++) {

            if (n % l == 0) {

                int times = n / l;
                String pattern = s.substring(0, l);

                StringBuilder res = new StringBuilder();

                while (times > 0) {
                    res.append(pattern);
                    times--;
                }

                if (res.toString().equals(s)) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {

        String s1 = "abab";
        String s2 = "aba";
        String s3 = "abcabcabc";

        System.out.println(repeatedSubstringPattern(s1)); // true
        System.out.println(repeatedSubstringPattern(s2)); // false
        System.out.println(repeatedSubstringPattern(s3)); // true
    }
}