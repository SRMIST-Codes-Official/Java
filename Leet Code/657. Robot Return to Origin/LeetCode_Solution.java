class Solution {
    public boolean judgeCircle(String moves) {
       int v=0;
       int h=0;
       for(char c : moves.toCharArray()){
        switch(c){
           case 'U':v++;
           break;
           case 'D':v--;
           break;
           case 'R':h++;
           break;
           default:h--;
        }
       }
       return (v==0 && h==0); 
    }
}