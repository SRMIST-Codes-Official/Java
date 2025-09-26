class Solution {
    public int getLeastFrequentDigit(int n) {
        int[] count=new int[10];
        while(n>0){
            int d=n%10;
            count[d]++;
            n=n/10;
        }
        int num=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<10;i++){
            if(count[i]==1){
                return i;
            }
            if(count[i]>0 && count[i]<min){
                min=count[i];
                num=i;
            }
        }
        return num;

    }
}