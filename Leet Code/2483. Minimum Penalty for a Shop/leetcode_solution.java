class Solution {
    public int bestClosingTime(String customers) {
        int y=0;
        int n=0;
        for(int i=0;i<customers.length();i++){
            if(customers.charAt(i)=='Y'){
                y++;
            }
        }
        int p=y;
        int h=0;
        int min=p;
        for(int i=1;i<=customers.length();i++){
            if(customers.charAt(i-1)=='Y'){
                y--;
                p=y+n;
            }else{
                n++;
                p=y+n;
            }
            if(p<min){
                h=i;
                min=p;
            }
        }
        return h;
    }
}