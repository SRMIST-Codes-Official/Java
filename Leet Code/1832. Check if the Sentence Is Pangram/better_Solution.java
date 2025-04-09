class Solution {
    public boolean checkIfPangram(String s) {
        for(char a='a';a<='z';a++){
            if(s.indexOf(a)==-1){
                return false;
            }
        }
        return true;
    }
}