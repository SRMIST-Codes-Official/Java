class Solution {
    public int maximizeSum(int[] nums, int k) {
        int n=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>n){
                n=nums[i];
            }
        }
        return (k*((2*n)+k-1))/2;
    }
}