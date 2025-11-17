class Solution {
    static final int MOD = 1000000007;
    public int numSub(String s) {
        long c=0;
        long oc=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                oc++;
            }else{
                c+=(oc+1)*oc/2 % MOD;
                oc=0;
            }
        }
        c+=(oc+1)*oc/2 % MOD;
        return (int)c;
    }
}