class Solution {
    public boolean isPalindrome(int x) {
        int temp =x;
        if(x<0){
            return false;
        }
        else{
            int d;
            int r=0;
            while(x>0){
                d=x%10;
                r=(r*10)+d;
                x=x/10;
            }
            if(temp==r){
                return true;
            }
            else{
                return false;
            } 
        }
    }
}