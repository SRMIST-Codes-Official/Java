class Solution {
    public int smallestNumber(int n, int t) {
        for(int i=n;;i++){
            int temp=i;
            int p=1;
            while(temp>0){
                int d=temp%10;
                p=p*d;
                temp=temp/10;
            }
            if(p%t==0){
                return i;
            }
        }
    }
}