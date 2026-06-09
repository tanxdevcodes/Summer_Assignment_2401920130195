
import java.util.Arrays;

class Solution {
    public boolean isAnagram(String s, String t) {
        char[] ss = s.toCharArray();  
        char[] tt = t.toCharArray();  

        Arrays.sort(ss);    
        Arrays.sort(tt);    

        return Arrays.equals(ss, tt);
    }
}

public class ValidAnagram {
    public static void main(String[] args) {
        Solution obj = new Solution();

        String s = "anagram";
        String t = "nagaram";

        boolean result = obj.isAnagram(s, t);

        System.out.println(result);
    }
}