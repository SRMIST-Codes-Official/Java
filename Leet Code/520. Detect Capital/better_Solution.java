class Solution {
    public boolean detectCapitalUse(String word) {
        int capitalCount=0;
        for(int i=0;i<word.length();i++){
            if(Character.isUpperCase(word.charAt(i))){
                capitalCount=capitalCount+1;
            }
        }
        return (capitalCount == word.length() ||  
                capitalCount == 0 ||              
                (capitalCount == 1 && Character.isUpperCase(word.charAt(0))));
        
    }
}