class Solution {
    public int possibleStringCount(String word) {
        int c=0;
        char ch=word.charAt(0);
        for(int i=1;i<word.length();i++){
            if(ch==word.charAt(i)){
                c++;
            }else{
                ch=word.charAt(i);
            }
        }
        return c+1;
    }
}