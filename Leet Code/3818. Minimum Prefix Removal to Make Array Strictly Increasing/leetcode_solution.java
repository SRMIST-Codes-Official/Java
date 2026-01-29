class Solution {
    public int minimumPrefixLength(int[] nums) {
        for(int i=nums.length-1;i>=1;i--){
            if(nums[i]<=nums[i-1]){
                return i;
            }
        }
        return 0;
    }
}