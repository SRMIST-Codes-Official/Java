class Solution {
    public int addDigits(int num) {
        if(num>9){
        while(num>9){
            num=sum(num);
        }
        return num;
        }
        else{
            return num;
        }
     }
    public int sum(int n){
        int s=0;
        int d;
        while(n>0){
            d=n%10;
            s=s+d;
            n=n/10;
        }
        return s;
    }
}