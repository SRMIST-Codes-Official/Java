class Solution {
    public boolean check(int[] nums) {
        int dec=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<nums[i-1]){
                dec++;
            }
        }
        if(nums[0]<nums[nums.length-1]){
            dec++;
        }
        if(dec<=1){
            return true;
        }
        return false;
    }
}