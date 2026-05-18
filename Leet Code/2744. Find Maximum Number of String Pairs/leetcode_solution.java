class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int c=0;
        for(int i=0;i<words.length;i++){
            String rev=new StringBuilder(words[i]).reverse().toString();
            for(int j=i+1;j<words.length;j++){
                if(rev.equals(words[j])){
                    c++;
                }
            }
        }
        return c;
    }
}