class Solution {
    public int countPartitions(int[] nums) {
        int sum=0;
        int c=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        int lsum=0;
        for(int i=0;i<nums.length-1;i++){
            lsum+=nums[i];
            sum-=nums[i];
            if((sum-lsum) %2==0){
                c++;
            }
        }
        return c;
    }
}