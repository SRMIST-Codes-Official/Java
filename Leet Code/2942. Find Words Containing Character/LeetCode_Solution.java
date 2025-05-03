class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer> c = new ArrayList<>();
        for(int i=0;i<words.length;i++){
            if(words[i].indexOf(x)!=-1){
                c.add(i);
            }
        }
        return c;
    }
}