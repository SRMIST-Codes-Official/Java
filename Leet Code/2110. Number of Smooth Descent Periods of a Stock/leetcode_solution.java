class Solution {
    public long getDescentPeriods(int[] prices) {
        int prev=prices[0];
        long c=0;
        long l=1;
        for(int i=1;i<prices.length;i++){
            if(prev-1 == prices[i]){
                prev=prices[i];
                l++;
            }else{
                c=c+((l*(l+1))/2);
                l=1;
                prev=prices[i];
            }
        }
        c=c+((l*(l+1))/2);
        return c;
    }
}