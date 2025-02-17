class Solution {
    public boolean isPowerOfThree(int n) {
        if(n>=(Math.pow(2,31)-1) || n<0){
            return false;
        } 
        int i=0;
        int d=0;
        while(d<n){
            d=(int)Math.pow(3,i);
            i++;
        }
        if(d==n && n!=0){
            return true;
        }
        return false;
    }
}