class Solution {
    public int longestSubarray(int[] nums) {
        int sum=0;
        int lastsum=0;
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                c++;
            }if(nums[i]!=1){
                if(lastsum+c>sum){
                    sum=lastsum+c;
                }
                lastsum=c;
                c=0;
            }
        }
        if(lastsum+c>sum){
            sum=lastsum+c;
        }
        if(sum==nums.length){
            return sum-1;
        }
        return sum;
    }
}