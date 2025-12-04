class Solution {
    public int countCollisions(String directions) {
        char[] d=directions.toCharArray();
        int c=d.length;
        for(int i=0;i<d.length;i++){
            if(d[i]=='L'){
                c--;
            }else{
                break;
            }
        }
        for(int i=d.length-1;i>=0;i--){
            if(d[i]=='R'){
                c--;
            }else{
                break;
            }
        }
        for(int i=0;i<d.length;i++){
            if(d[i]=='S'){
                c--;
            }
        }
        return c;
    }
}