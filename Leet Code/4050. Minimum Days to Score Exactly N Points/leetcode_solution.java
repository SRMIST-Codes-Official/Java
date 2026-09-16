class Solution {
    public int minDays(int n) {
        int[] dp=new int[n+1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0]=-1;
        for(int i=0;i<=n;i++){
            for(int j=1;j*(j+1)/2 <= i; j++){
                int p=j*(j+1)/2;
                dp[i]=Math.min(dp[i], dp[i-p]+j+1);
            }
        }
        return dp[n];
    }
}