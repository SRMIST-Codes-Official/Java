class Solution {
    public boolean halvesAreAlike(String s) {
        int l=0;
        int r=0;
        for(int i=0;i<s.length();i++){
            if(i<s.length()/2 && vowel(s.charAt(i))){
                l++;
            }else if(i>=s.length()/2 && vowel(s.charAt(i))){
                r++;
            }
        }
        if(l==r){
            return true;
        }
        return false;
    }
    boolean vowel(char c){
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}