class Solution {
    public int minMoves(int[] nums) {
        int m=0;
        for(int i=0;i<nums.length;i++){
            m=Math.max(m,nums[i]);
        }
        int c=0;
        for(int i=0;i<nums.length;i++){
            c+=(m-nums[i]);
        }
        return c;
    }
}