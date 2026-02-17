class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        String s="";
        for(int i=0;i<words.length;i++){
            int sum=0;
            for(int j=0;j<words[i].length();j++){
                sum+=weights[words[i].charAt(j)-'a'];
            }
            s+=(char)('z'-(sum%26));
        }
        return s;
    }
}