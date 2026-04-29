class Solution {
    public boolean validDigit(int n, int x) {
        String a=n+"";
        char b=String.valueOf(x).charAt(0);
        if(a.charAt(0)==b){
            return false;
        }
        if(a.indexOf(b)==-1){
            return false;
        }
        return true;
    }
}