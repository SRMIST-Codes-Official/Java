class Solution {
    public boolean squareIsWhite(String coordinates) {
        char[] l={'a','b','c','d','e','f','g','h'};
        for(int i=0;i<=7;i++){
            if(coordinates.charAt(0)==l[i]){
                int num=Character.getNumericValue(coordinates.charAt(1));
                if(i%2==0 && num%2==0){
                    return true;
                }
                else if(i%2!=0 && num%2!=0){
                    return true;
                }
            }
        }
        return false;
    }
}