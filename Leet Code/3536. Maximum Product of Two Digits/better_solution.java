class Solution {
    public int maxProduct(int n) {
        int max=0;
        int smax=0;
        while(n>0){
            int d=n%10;
            if(d>max){
                smax=max;
                max=d;
            }else if(d>smax){
                smax=d;
            }
            n=n/10;
        }
        return max*smax;
    }
}