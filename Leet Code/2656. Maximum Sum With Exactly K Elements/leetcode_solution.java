class Solution {
    public int maximizeSum(int[] nums, int k) {
        int n=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>n){
                n=nums[i];
            }
        }
        int s=n;
        for(int i=1;i<k;i++){
            s+=(n+i);
        }
        return s;
    }
}