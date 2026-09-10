class Solution {
    public int maxNumberOfBalloons(String text) {

        HashMap<Character, Integer> map = new HashMap<>();

        String s = "balloon";

        char arr[] = text.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        int count = 0;

        int i = 0;

        while (map.containsKey(s.charAt(i)) &&
               map.get(s.charAt(i)) > 0) {

            map.put(s.charAt(i), map.get(s.charAt(i)) - 1);
            i++;

            if (i == s.length()) {
                count++;
                i = 0;
            }
        }

        return count;
    }
}