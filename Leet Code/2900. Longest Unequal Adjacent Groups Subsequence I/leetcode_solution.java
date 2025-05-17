class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        ArrayList<String> l = new ArrayList<>();
        l.add(words[0]);
        for(int i=1;i<words.length;i++){
            if(groups[i]!= groups[i-1]){
                l.add(words[i]);
            }
        }
        return l;
    }
}