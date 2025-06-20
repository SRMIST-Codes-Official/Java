class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] words = text.split(" ");
        char[] letter = brokenLetters.toCharArray();
        int c= 0;
        for(int i=0;i<words.length;i++){
            for(int j=0;j<letter.length;j++){
                if(words[i].indexOf(letter[j])!=-1){
                    c++;
                    break;
                }
            }
        }
        return words.length-c;
    }
}