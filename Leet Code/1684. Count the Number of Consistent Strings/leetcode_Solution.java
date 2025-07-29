class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int c=words.length;
        for(int i=0;i<words.length;i++){
            for(char ch : words[i].toCharArray()){
                if (allowed.indexOf(ch) == -1){
                    c--;
                    break;
                }
            }
        }
        return c;
    }
}