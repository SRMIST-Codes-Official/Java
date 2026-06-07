class Solution {
    public boolean consecutiveSetBits(int n) {
        String b = Integer.toBinaryString(n);
        boolean res=false;
        for(int i=0;i<b.length()-1;i++){
            if(b.charAt(i)=='1' && b.charAt(i)==b.charAt(i+1)){
                if(res){
                    return false;
                }else{
                    res=true;
                }
            }
        }
        return res;
    }
}