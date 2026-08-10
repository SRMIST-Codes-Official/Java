class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        return solve(nums.length-1, nums, dp);
    }
    int solve(int i, int[] nums,  int[] dp){
        if(i==0){
            return nums[i];
        }
        if(i<0){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int pick=nums[i]+solve(i-2,nums,dp);
        int notpick=solve(i-1,nums,dp);
        dp[i]=Math.max(pick, notpick);
        return dp[i];
    }
}