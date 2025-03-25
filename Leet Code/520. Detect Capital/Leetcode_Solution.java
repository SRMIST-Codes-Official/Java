class Solution {
    public boolean detectCapitalUse(String word) {
        int l=word.length();
        String u=word.toUpperCase();
        int c1=0;
        String lo=word.toLowerCase();
        int c2=0;
        for(int i=0;i<l;i++){
            if(word.charAt(i) == u.charAt(i)){
                c1++;
            }
            if(word.charAt(i)==lo.charAt(i)){
                c2++;
            }
        }
        if(c1==l || c2==l){
            return true;
        }
        if(c1==1 && word.charAt(0)==u.charAt(0)){
            return true;
        }
        return false;
    }
}