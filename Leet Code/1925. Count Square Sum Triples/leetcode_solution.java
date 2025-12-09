class Solution {
    public int countTriples(int n) {
        int c=0;
        for(int i=1;i<=n;i++){
            for(int j=i+1;j<=n;j++){
                int p=i*i + j*j;
                if(p>n*n){
                    break;
                }
                if(Math.sqrt(p) == (int)Math.sqrt(p) && Math.sqrt(p)<=n){
                    c=c+2;
                }
            }
        }
        return c;
    }
}