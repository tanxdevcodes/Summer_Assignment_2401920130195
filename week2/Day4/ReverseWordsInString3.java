
public class ReverseWordsInString3 {

    public static String reverseWords(String s) {
        StringBuilder word = new StringBuilder();
        StringBuilder res = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (ch != ' ') {
                word.append(ch);
            } else {
                res.append(word.reverse());
                res.append(' ');
                word.setLength(0);
            }
        }

        res.append(word.reverse());

        return res.toString();
    }

    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";

        System.out.println(reverseWords(s));
    }
}