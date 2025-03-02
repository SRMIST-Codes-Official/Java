class Solution {
    public int getSum(int a, int b) {
        int m=Math.min(a,b);
        int max=Math.max(a,b);
        if(m<0){
            for(int i=m;i<0;i++){
            max--;
        }
        }else{
            for(int i=1;i<=m;i++){
            max++;
        }
        }
        return max;
    }
}