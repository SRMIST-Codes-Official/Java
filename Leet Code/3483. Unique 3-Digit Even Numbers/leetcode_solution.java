class Solution {
    public int totalNumbers(int[] digits) {
        int[] f=new int[10];
        int c=0;
        for(int i=0;i<digits.length;i++){
            f[digits[i]]++;
        }
        for(int i=1;i<=9;i++){
            for(int j=0;j<=9;j++){
                for(int k=0;k<=8;k=k+2){
                    f[i]--;
                    f[j]--;
                    f[k]--;
                    if(f[i]>=0 && f[j]>=0 && f[k]>=0){
                        c++;
                    }
                    f[i]++;
                    f[j]++;
                    f[k]++;
                }
            }
        }
        return c;
    }
}