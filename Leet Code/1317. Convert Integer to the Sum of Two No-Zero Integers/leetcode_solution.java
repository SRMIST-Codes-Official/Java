class Solution {
    public int[] getNoZeroIntegers(int n) {
        int[] a=new int[2];
        for(int i=1;i<n;i++){
            a[0]=i;
            a[1]=n-i;
            if(String.valueOf(a[0]).contains("0") || String.valueOf(a[1]).contains("0")){
                continue;
            }else{
                break;
            }
        }
        return a;
    }
}