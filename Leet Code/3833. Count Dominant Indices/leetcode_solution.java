class Solution {
    public int dominantIndices(int[] nums) {
        int sum=0;
        for(int i =0;i<nums.length;i++){
            sum+=nums[i];
        }
        int dom=0;
        for(int i=0;i<nums.length-1;i++){
            sum=sum-nums[i];
            if(nums[i]>sum/(nums.length-i-1)){
                dom++;
            }
        }
        return dom;
    }
}