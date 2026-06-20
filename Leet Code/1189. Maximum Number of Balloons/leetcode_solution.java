class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] c=new int[26];
        for(char ch: text.toCharArray()){
            c[ch-'a']++;
        }
        int a=Math.min(c[0], c[1]);
        a=Math.min(a, c[11]/2);
        a=Math.min(a,c[14]/2);
        return Math.min(a,c[13]);
    }
}
