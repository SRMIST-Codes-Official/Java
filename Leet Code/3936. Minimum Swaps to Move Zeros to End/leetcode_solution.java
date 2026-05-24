class Solution {
    public int minimumSwaps(int[] nums) {
        int zc=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zc++;
            }
        }
        int x=zc;
        for(int i=nums.length-1;i>nums.length-1-x;i--){
            if(nums[i]==0){
                zc--;
            }
        }
        return zc;
    }
}