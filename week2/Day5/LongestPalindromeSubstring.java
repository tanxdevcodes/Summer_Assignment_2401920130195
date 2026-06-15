
public class LongestPalindromeSubstring {

    public static String longestPalindrome(String s) {
        StringBuilder res = new StringBuilder();

        int left, right;

        for (int i = 0; i < s.length(); i++) {

            // Odd length palindrome
            left = i;
            right = i;

            while (left >= 0 && right < s.length()
                    && s.charAt(left) == s.charAt(right)) {
                left--;
                right++;
            }

            String oddPalindrome = s.substring(left + 1, right);

            if (res.length() < oddPalindrome.length()) {
                res.setLength(0);
                res.append(oddPalindrome);
            }

            // Even length palindrome
            left = i;
            right = i + 1;

            while (left >= 0 && right < s.length()
                    && s.charAt(left) == s.charAt(right)) {
                left--;
                right++;
            }

            String evenPalindrome = s.substring(left + 1, right);

            if (res.length() < evenPalindrome.length()) {
                res.setLength(0);
                res.append(evenPalindrome);
            }
        }

        return res.toString();
    }

    public static void main(String[] args) {
        String s = "babad";

        String result = longestPalindrome(s);

        System.out.println("Longest Palindromic Substring: " + result);
    }
}