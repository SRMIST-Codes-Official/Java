class Solution {
    public int totalWaviness(int num1, int num2) {
        int count=0;
        for(int i=num1;i<=num2;i++){
            count+=wave(i);
        }
        return count;
    }
    int wave(int n){
        int c=0;
        int prev=n%10;
        n=n/10;
        int cur=n%10;
        n=n/10;
        while(n>0){
            int nxt=n%10;
            if((cur>nxt && cur>prev) || (cur<nxt && cur<prev)){
                c++;
            }
            prev=cur;
            cur=nxt;
            n=n/10;
        }
        return c;
    }
}