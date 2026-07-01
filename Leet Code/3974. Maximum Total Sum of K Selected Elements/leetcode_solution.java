class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        long sum=0;
        Arrays.sort(nums);
        int n=nums.length;
        long m=(long)mul;
        for(int i=n-1;i>=n-k;i--){
            if(m>1){
                long t=(long)nums[i]*m;
                sum+=t;
                m--;
            }else{
                sum+=nums[i];
            }
        }
        return sum;
    }
}