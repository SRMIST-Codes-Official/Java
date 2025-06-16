class Solution {
    public int maximumDifference(int[] nums) {
        int d=-1;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i] <nums[j] && nums[j]-nums[i] >d){
                    d=nums[j]-nums[i];
                }
            }
        }
        return d;
    }
}