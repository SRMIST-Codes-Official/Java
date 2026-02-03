class Solution {
    public int minimumCost(int[] nums) {
        int s=nums[0];
        int s1=51;
        int s2=51;
        for(int i=1;i<nums.length;i++){
            if(s1>nums[i]){
                s2=s1;
                s1=nums[i];
            }else if(s2>nums[i]){
                s2=nums[i];
            }
        }
        return s+s1+s2;
    }
}