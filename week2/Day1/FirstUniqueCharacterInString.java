
import java.util.HashMap;

class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;
    }
}

public class FirstUniqueCharacterInString {
    public static void main(String[] args) {
        Solution obj = new Solution();

        String s = "loveleetcode";

        int result = obj.firstUniqChar(s);

        System.out.println("Index of first unique character: " + result);
    }
}