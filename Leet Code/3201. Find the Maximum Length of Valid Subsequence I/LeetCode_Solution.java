class Solution {
    public int maximumLength(int[] nums) {
        int ee = 0;
        int oo = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                oo++;
            } else {
                ee++;
            }
        }
        int oe = 0;
        int eo = 0;
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == j) {
                eo++;
                if (j == 1) {
                    j = 0;
                } else {
                    j = 1;
                }
            }
        }
        j = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == j) {
                oe++;
                if (j == 1) {
                    j = 0;
                } else {
                    j = 1;
                }
            }
        }
        return Math.max(Math.max(ee, oo), Math.max(eo, oe));
    }
}