class Solution {
    public int dominantIndex(int[] nums) {
        int m=0;
        int index=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>m){
                m=nums[i];
                index=i;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(i!=index && nums[i]*2 > m){
                return -1;
            }
        }
        return index;
    }
}