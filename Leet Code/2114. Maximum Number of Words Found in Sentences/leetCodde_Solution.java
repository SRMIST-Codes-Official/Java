class Solution {
    public int mostWordsFound(String[] sentences) {
        int c=0;
        for(int i=0;i<sentences.length;i++){
            String[] w=sentences[i].split(" ");
            if(w.length>c){
                c=w.length;
            }
        }
        return c;
    }
}