class Solution {
    public int totalMoney(int n) {
        int m=0;
        int c=1;
        int t=0;
        for(int i=0;i<n;i++){
            if(i%7==0){
                m++;
                t+=m;
                c=m;
            }else{
                c++;
                t+=c;
            }
        }
        return t;
    }
}