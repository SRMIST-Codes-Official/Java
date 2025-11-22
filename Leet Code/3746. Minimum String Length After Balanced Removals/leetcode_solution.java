class Solution {
    public int minLengthAfterRemovals(String s) {
        int ac=0;
        int bc=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'){
                ac++;
            }else{
                bc++;
            }
        }
        return Math.abs(ac-bc);
    }
}