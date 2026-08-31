

import java.util.HashSet;

class Solution {
    public int missingMultiple(int[] nums, int k) {

        HashSet<Integer> h1 = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            h1.add(nums[i]);
        }

        for (int i = 1; i <= nums.length + 1; i++) {
            int p = i * k;

            if (!h1.contains(p)) {
                return p;
            }
        }

        return -1;
    }
}