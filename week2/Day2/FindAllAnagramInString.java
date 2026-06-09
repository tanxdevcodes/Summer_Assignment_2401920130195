
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FindAllAnagramInString {

    public static List<Integer> findAnagrams(String s, String p) {

        ArrayList<Integer> list = new ArrayList<>();
        int[] pCount = new int[26];
        int[] sCount = new int[26];

        for (char c : p.toCharArray()) {
            pCount[c - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {

            sCount[s.charAt(i) - 'a']++;

            if (i >= p.length()) {
                sCount[s.charAt(i - p.length()) - 'a']--;
            }

            if (Arrays.equals(sCount, pCount)) {
                list.add(i - p.length() + 1);
            }
        }

        return list;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter s: ");
        String s = sc.nextLine();

        System.out.print("Enter p: ");
        String p = sc.nextLine();

        List<Integer> result = findAnagrams(s, p);

        System.out.println("Anagram starting indices: " + result);

    }
}