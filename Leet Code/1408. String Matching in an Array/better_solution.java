class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> l= new ArrayList<>();
        int n=words.length;
        for(int i=0;i<n;i++){
            if(ispart(words, words[i])){
                l.add(words[i]);
            }
        }
        return l;
    }
    boolean ispart(String[] words, String word){
        for(int i=0;i<words.length;i++){
            if(words[i].contains(word) && !(words[i].equals(word))){
                return true;
            }
        }
        return false;
    }
}