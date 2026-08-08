class Solution {
    public int climbStairs(int n) {
        if(n==1){
            return 1;
        }
        int prev2=0;
        int prev=1;
        for(int i=1;i<=n;i++){
            int temp=prev;
            prev=prev+prev2;
            prev2=temp;
        }
        return prev;
    }
}