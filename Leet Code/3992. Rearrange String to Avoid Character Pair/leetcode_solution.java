class Solution {
    public String rearrangeString(String s, char x, char y) {
        String res="";
        for(char c: s.toCharArray()){
            if(c==y){
                res=c+res;
            }else{
                res=res+c;
            }
        }
        return res;
    }
}