class Solution {
    public int sumOfPrimesInRange(int n) {
        int r=rev(n);
        int min=Math.min(n,r);
        int max=Math.max(n,r);
        int s=0;
        for(int i=min;i<=max;i++){
            if(prime(i)){
                s+=i;
            }
        }
        return s;
    }
    boolean prime(int n){
        if(n<2){
            return false;
        }
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    int rev(int n){
        int r=0;
        while(n>0){
            int d=n%10;
            r=(r*10)+d;
            n=n/10;
        }
        return r;
    }
}