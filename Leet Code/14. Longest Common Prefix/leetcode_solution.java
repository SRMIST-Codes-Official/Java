class Solution {
    public String longestCommonPrefix(String[] strs) {
        for(int i=strs[0].length();i>=0;i--){
            String s=strs[0].substring(0,i);
            int c=0;
            for(int j=0;j<strs.length;j++){
                if(strs[j].startsWith(s)){
                    c++;
                }else{
                    break;
                }
            }
            if(c==strs.length){
                return s;
            }
        }
        return "";
    }
}