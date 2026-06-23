class Solution {
    public int maxDistance(String moves) {
        int v=0;
        int h=0;
        int e=0;
        for(char ch: moves.toCharArray()){
            if(ch=='L'){
                h--;
            }else if(ch=='R'){
                h++;
            }else if(ch=='U'){
                v++;
            }else if(ch=='D'){
                v--;
            }else{
                e++;
            }
        }
        return Math.abs(h)+Math.abs(v)+e;
    }
}