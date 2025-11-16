class Solution {
    public int minMoves(int[] nums) {
        int m=nums[0];
        int s=nums[0];
        for(int i=1;i<nums.length;i++){
            m=Math.max(m,nums[i]);
            s+=nums[i];
        }
        return m*nums.length - s;
    }
}