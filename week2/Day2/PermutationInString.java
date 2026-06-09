
import java.util.Arrays;
import java.util.Scanner;

public class PermutationInString {

    public static boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length()) {
            return false;
        }

        int[] s1count = new int[26];
        int[] s2count = new int[26];

        // Count frequency of s1
        for (char c : s1.toCharArray()) {
            s1count[c - 'a']++;
        }

        // Sliding window on s2
        for (int i = 0; i < s2.length(); i++) {

            s2count[s2.charAt(i) - 'a']++;

            // Maintain window size
            if (i >= s1.length()) {
                s2count[s2.charAt(i - s1.length()) - 'a']--;
            }

            // Compare frequency arrays
            if (Arrays.equals(s1count, s2count)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter s1: ");
        String s1 = sc.nextLine();

        System.out.print("Enter s2: ");
        String s2 = sc.nextLine();

        boolean result = checkInclusion(s1, s2);

        System.out.println("Result: " + result);

        sc.close();
    }
}