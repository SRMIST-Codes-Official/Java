class Solution {
    public int countEven(int num) {
        int s=0;
        int n=num;
        while(n>0){
            int d=n%10;
            s+=d;
            n=n/10;
        }
        if(s%2==0){
            return num/2;
        }
        return (num-1)/2;
    }
}