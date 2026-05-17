class Solution {
    public boolean isAdjacentDiffAtMostTwo(String s) {
        for(int i=0;i<s.length()-1;i++){
            int diff=Math.abs(s.charAt(i)-s.charAt(i+1));
            if(diff>2){
                return false;
            }
        }
        return true;
    }
}