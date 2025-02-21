class Solution {
    public boolean isSameAfterReversals(int num) {
        int a=reverse(num);
        int b=reverse(a);
        if(b==num){
            return true;
        }
        return false;
    }
    int reverse(int n){
        int d=0;
        int x=0;
        while(n>0){
            d=n%10;
            x=(x*10) + d;
            n=n/10;
        }
        return x;
    }
}