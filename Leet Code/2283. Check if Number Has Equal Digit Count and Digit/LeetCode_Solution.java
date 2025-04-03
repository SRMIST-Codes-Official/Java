class Solution {
    public boolean digitCount(String num) {
        for(int i=0;i<num.length();i++){
            int d=Character.getNumericValue(num.charAt(i));
            int ac=count(i, num);
            if(ac!=d){
                return false;
            }
        }
        return true;
    }
    int count(int n,String num){
        int count=0;
        for(int i=0;i<num.length();i++){
            int c=Character.getNumericValue(num.charAt(i));
            if(n==c){
                count++;
            }
        }
        return count;
    }
}