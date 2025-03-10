class Solution {
    public int alternateDigitSum(int n) {
        int temp=n;
        int count =0;
        int sum=0;
        while(n>0){
            n=n/10;
            count++;
        }
        while(temp>0){
            int d=temp%10;
            if(count%2==0){
                sum=sum-d;
            }else{
                sum=sum+d;
            }
            count--;
            temp=temp/10;
        }
        return sum;
    }
}
