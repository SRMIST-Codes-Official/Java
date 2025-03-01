class Solution {
    public boolean isPowerOfFour(int n) {
        double s= Math.log(n)/Math.log(4);
        if(n<1){
            return false;
        }
        if(Math.floor(s)==s){
            return true;
        }
        else{
            return false;
        }
    }
}