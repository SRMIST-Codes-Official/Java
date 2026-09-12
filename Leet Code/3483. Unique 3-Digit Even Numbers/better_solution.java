class Solution {
    public int totalNumbers(int[] digits) {
        int[] f=new int[10];
        int c=0;
        for(int i=0;i<digits.length;i++){
            f[digits[i]]++;
        }
        for(int i=1;i<=9;i++){
            f[i]--;
            if(f[i]<0){
                f[i]++;
                continue;
            }
            for(int j=0;j<=9;j++){
                f[j]--;
                if(f[j]<0){
                    f[j]++;
                    continue;
                }
                for(int k=0;k<=8;k=k+2){
                    f[k]--;
                    if(f[k]>=0){
                        c++;
                    }
                    f[k]++;
                }
                f[j]++;
            }
            f[i]++;
        }
        return c;
    }
}