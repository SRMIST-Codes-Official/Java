class Solution {
    public int[] getNoZeroIntegers(int n) {
        int[] a=new int[2];
        for(int i=1;i<n;i++){
            a[0]=i;
            a[1]=n-i;
            if(haszero(a[0]) || haszero(a[1])){
                continue;
            }else{
                break;
            }
        }
        return a;
    }
    boolean haszero(int n){
        while(n>0){
            int d=n%10;
            if(d==0){
                return true;
            }
            n=n/10;
        }
        return false;
    }
}