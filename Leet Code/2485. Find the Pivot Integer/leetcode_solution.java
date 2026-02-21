class Solution {
    public int pivotInteger(int n) {
        int s=n*(n+1)/2;
        int ls=0;
        for(int i=1;i<=n;i++){
            ls+=i;
            if(ls==s){
                return i;
            }
            s-=i;
        }
        return -1;
    }
}