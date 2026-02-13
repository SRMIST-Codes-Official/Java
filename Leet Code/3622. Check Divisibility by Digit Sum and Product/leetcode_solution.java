class Solution {
    public boolean checkDivisibility(int n) {
        int s=0;
        int p=1;
        int temp=n;
        while(temp>0){
            int d=temp%10;
            s+=d;
            p*=d;
            temp=temp/10;
        }
        if(n%(s+p)==0){
            return true;
        }
        return false;
    }
}