class Solution {
    public boolean checkTwoChessboards(String c1, String c2) {
        if(colour(c1)==colour(c2)){
            return true;
        }
        return false;
    }
    boolean colour(String s){
        return (s.charAt(0) - 'a' + 1 + s.charAt(1) - '0')%2!=0;
    }
}