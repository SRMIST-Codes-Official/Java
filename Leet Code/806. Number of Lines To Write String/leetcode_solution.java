class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int px=0;
        int lc=1;
        for(int i=0;i<s.length();i++){
            if(px+widths[s.charAt(i)-'a']>100){
                px=0;
                lc++;
            }
            px=px+widths[s.charAt(i)-'a'];
        }
        int[] arr={lc,px};
        return arr;
    }
}