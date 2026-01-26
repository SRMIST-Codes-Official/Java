class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int m=0;
        for (int i = 0; i < nums.length / 2; i++) {
            m=Math.max(m,nums[i]+nums[nums.length-i-1]);
        }
        return m;
    }
}