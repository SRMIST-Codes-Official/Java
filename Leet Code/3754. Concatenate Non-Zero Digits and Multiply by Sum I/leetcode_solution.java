class Solution {
    public long sumAndMultiply(int n) {
        long num=0;
        long s=0;
        while(n>0){
            long d=n%10;
            if(d!=0){
                num=num*10+d;
                s=s+d;
            }
            n=n/10;
        }
        long rev=0;
        while(num>0){
            long d=num%10;
            rev=rev*10 + d;
            num=num/10;
        }
        return rev*s;
    }
}