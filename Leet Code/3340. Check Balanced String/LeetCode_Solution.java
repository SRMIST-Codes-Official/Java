
class Solution {
    public boolean isBalanced(String num) {
        int e=0;
        int o=0;
        for(int i=0;i<num.length();i++){
            if(i%2==0){
                e=e+(Character.getNumericValue(num.charAt(i)));
            }else{
                o=o+(Character.getNumericValue(num.charAt(i)));
            }
        }
        if(e==o){
            return true;
        }
        return false;
    }
}