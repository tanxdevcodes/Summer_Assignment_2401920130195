import java.util.Arrays;

public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {

        Arrays.sort(strs);

        String start = strs[0];
        String end = strs[strs.length - 1];

        StringBuilder res = new StringBuilder();

        for (int i = 0; i < Math.min(start.length(), end.length()); i++) {

            if (start.charAt(i) == end.charAt(i)) {
                res.append(start.charAt(i));
            } else {
                break;
            }
        }

        return res.toString();
    }

    public static void main(String[] args) {

        String[] strs = {"flower", "flow", "flight"};

        System.out.println(longestCommonPrefix(strs));
    }
}
