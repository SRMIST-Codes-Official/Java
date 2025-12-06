class Solution {
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++){
            String r =rever(words[i]);
            if(r.equals(words[i])){
                return r;
            }
        }
        return "";
    }
    String rever(String w){
        String s="";
        for(int i=0;i<w.length();i++){
            s=w.charAt(i)+s;
        }
        return s;
    }
}