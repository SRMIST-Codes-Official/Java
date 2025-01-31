class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==1){
            return true;
        }
        else if(n%2==1){
            return false;
        }
        else{
            for(int i=0;i<=31;i++){
                if(Math.pow(2,i)==n){
                    return true;
                }
            }
        }
        return false;
    }
}
