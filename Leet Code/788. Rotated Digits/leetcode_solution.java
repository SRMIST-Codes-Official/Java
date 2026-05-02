class Solution {
    public int rotatedDigits(int n) {
        int c=0;
        for(int i=2;i<=n;i++){
            if(good(i)){
                c++;
            }
        }
        return c;
    }
    boolean good(int n){
        boolean b=false;
        while(n>0){
            int d=n%10;
            if(d==3 || d==4 ||d==7){
                return false;
            }
            if(d!=0 && d!=8 && d!=1){
                b= true;
            }
            n=n/10;
        }
        return b;
    }
}