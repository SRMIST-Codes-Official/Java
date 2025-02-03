//remove public from class in leetcode
 class Solution {
    public boolean isHappy(int n) {
        while(n>9){
            n=squaresum(n);
        } 
        if(n==1 || n==7){
            return true;
        }
        else
        return false;
    }
    int squaresum(int n){
        int d;
        int s=0;
        while(n>0){
            d=n%10;
            s=s+(d*d);
            n=n/10;
        }
        return s;
    }
}