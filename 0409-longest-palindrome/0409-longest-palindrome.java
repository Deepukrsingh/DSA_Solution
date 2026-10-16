
import java.util.*;

class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        int length = 0;

        for (char ch : map.keySet()) {
            int count = map.get(ch);
            length = length + (count / 2) * 2;
        }

        if (length < s.length()) {
            length++;
        }

        return length;
    }
}
