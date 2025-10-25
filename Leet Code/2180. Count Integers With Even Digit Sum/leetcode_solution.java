class Solution {
    public int countEven(int num) {
        int c=0;
        for(int i=2;i<=num;i++){
            if(digsum(i)%2==0){
                c++;
            }
        }
        return c;
    }
    int digsum(int n){
        int s=0;
        while(n>0){
            int d=n%10;
            s+=d;
            n=n/10;
        }
        return s;
    }
}