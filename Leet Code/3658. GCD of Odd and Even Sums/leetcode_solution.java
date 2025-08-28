class Solution {
    public int gcdOfOddEvenSums(int n) {
        int esum=0;
        int osum=0;
        int e=2;
        int o=1;
        int gcd=1;
        for(int i=0;i<n;i++){
            esum+=e;
            e+=2;
            osum+=o;
            o+=2;
        }
        for(int i=1;i<osum;i++){
            if(esum%i==0 && osum%i==0){
                gcd=i;
            }
        }
        return gcd;
    }
}