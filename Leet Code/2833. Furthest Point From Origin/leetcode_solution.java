class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int c=0;
        int m=0;
        for(char ch:moves.toCharArray()){
            if(ch=='L'){
                m++;
            }else if(ch=='R'){
                m--;
            }else{
                c++;
            }
        }
        return Math.abs(m)+c;
    }
}