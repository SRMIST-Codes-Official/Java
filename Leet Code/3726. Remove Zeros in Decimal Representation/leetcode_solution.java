class Solution {
    public long removeZeros(long n) {
        long num=0;
        while(n>0){
            long d=n%10;
            if(d!=0){
                num=num*10+d;
            }
            n=n/10;
        }
        long f=0;
        while(num>0){
            long d=num%10;
            f=f*10+d;
            num=num/10;
        }
        return f;
    }
}