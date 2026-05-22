class Solution {
    public int[] decrypt(int[] code, int k) {
        int[] arr=new int[code.length];
        if(k==0){
            return arr;
        }
        if(k>0){
            for(int i=0;i<code.length;i++){
                for(int j=1;j<=k;j++){
                    arr[i] += code[(i + j) % code.length];
                }
            }
        }if(k<0){
            for(int i=0;i<code.length;i++){
                for(int j=1;j<=(k*-1);j++){
                    arr[i] += code[(i - j + code.length) % code.length];
                }
            }
        }
        return arr;
    }
}