class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp=new int[amount+1];
        Arrays.fill(dp,-1);
        int c=solve(coins, dp, amount);
        if(c==Integer.MAX_VALUE){
            return -1;
        }
        return c;
    }
    int solve(int[] coins, int[] dp, int amount){
        if(amount==0){
            return 0;
        }
        if(amount<0){
            return Integer.MAX_VALUE;
        }
        if(dp[amount]!=-1){
            return dp[amount];
        }
        int c=Integer.MAX_VALUE;
        for(int i=0;i<coins.length;i++){
            int res= solve(coins, dp, amount-coins[i]);
            if(res!=Integer.MAX_VALUE){
                c=Math.min(c, res+1);
            }
        }
        dp[amount]=c;
        return dp[amount];
    }
}