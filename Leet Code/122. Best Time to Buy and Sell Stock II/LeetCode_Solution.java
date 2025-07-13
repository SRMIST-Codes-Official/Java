class Solution {
    public int maxProfit(int[] prices) {
        int p=0;
        int c=prices[0];
        for(int i=1;i<prices.length;i++){
            if(c>prices[i]){
                p+=c-prices[i-1];
            }else if(c<prices[i]){
                p+=prices[i]-c;
            }
            c=prices[i];
        }
        return p;
    }
}