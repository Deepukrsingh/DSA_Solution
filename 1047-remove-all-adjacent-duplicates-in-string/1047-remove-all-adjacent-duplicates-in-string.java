
import java.util.*;

class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (st.isEmpty()) {
                st.push(ch);
            } else {
                if (st.peek() == ch) {
                    st.pop();
                } else {
                    st.push(ch);
                }
            }
        }

        String stt = "";

        while (!st.isEmpty()) {
            stt = stt + st.pop();
        }

       
        char[] arr = stt.toCharArray();
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        return new String(arr);
    }
}
