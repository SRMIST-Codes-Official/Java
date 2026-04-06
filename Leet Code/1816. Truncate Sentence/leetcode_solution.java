class Solution {
    public String truncateSentence(String s, int k) {
        String[] w=s.split(" ");
        String res="";
        for(int i=0;i<k;i++){
            res=res+" "+w[i];
        }
        return res.trim();
    }
}