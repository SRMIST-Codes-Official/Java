class Solution {
    public int fib(int n) {
       int f=0;
       int s=1;
       int sum=0;
       int c=1;
       if(n==0)return f;
       while(c!=n){
        sum=f+s;
        f=s;
        s=sum;
        c++;
       } 
       return s;
    }
}