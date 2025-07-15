class Solution {
    public boolean isValid(String word) {
        boolean v=false;
        boolean co=false;
        if(word.length()<3){
            return false;
        }
        for(char c: word.toCharArray()){
            if(!Character.isLetterOrDigit(c)){
                return false;
            }
            if("aeiouAEIOU".indexOf(c)!=-1){
                v=true;
            }else if(Character.isLetter(c)){
                co=true;
            }
        }
        return v && co;
    }
}