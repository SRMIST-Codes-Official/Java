class Solution {
    public boolean canAliceWin(int[] nums) {
        int ss=0;
        int ds=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>9){
                ds+=nums[i];
            }else{
                ss+=nums[i];
            }
        }
        if(ds==ss){
            return false;
        }
        return true;
    }
}