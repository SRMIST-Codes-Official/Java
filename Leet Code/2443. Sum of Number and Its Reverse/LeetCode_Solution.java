class Solution {
    public boolean sumOfNumberAndReverse(int num) {
       for(int i=num/2;i<=num;i++){
        if(i+reverse(i)==num){
            return true;
        }
       } 
       return false;
    }
    int reverse(int n){
        int temp=0;
        while(n>0){
            temp=(temp*10)+(n%10);
            n=n/10;
        }
        return temp;
    }
}