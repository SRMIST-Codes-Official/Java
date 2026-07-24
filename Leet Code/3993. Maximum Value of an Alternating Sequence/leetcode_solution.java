class Solution {
    public long maximumValue(int n, int s, int m) {
        if(n==1){
            return s;
        }
        long s0=s;
        int h=(n-1)/2;
        if(n%2==0){
            s0=s0+((long)m*(n/2));
            s0=s0-((n/2)-1);
        }else{
            s0=s0+((long)m*(n/2));
            s0=s0-(long)((n/2)-1);
        }
        return s0;
    }
}