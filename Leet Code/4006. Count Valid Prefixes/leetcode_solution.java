class Solution {
    public int countValidPrefixes(String s) {
        int c=0;
        int zc=0;
        int oc=0;
        for(char ch:s.toCharArray()){
            if(ch=='0'){
                zc++;
            }else{
                oc++;
            }
            if(Math.abs(oc-zc)<=1){
                c++;
            }
        }
        return c;
    }
}