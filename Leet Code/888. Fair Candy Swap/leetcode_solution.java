class Solution {
    public int[] fairCandySwap(int[] a, int[] b) {
        int s=0;
        int s1=0;
        int s2=0;
        int[] result=new int[2];
        for(int i=0;i<a.length;i++){
            s+=a[i];
            s1+=a[i];
        }
        for(int i=0;i<b.length;i++){
            s+=b[i];
            s2+=b[i];
        }
        int e=s/2;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                if(s1-a[i]+b[j] == s2-b[j]+a[i]  && e==s1-a[i]+b[j]){
                    result[0]=a[i];
                    result[1]=b[j];
                    return result;
                }
            }
        }
        return result;
    }
}