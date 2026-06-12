class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0;
        int len=0;
        int[] last=new int[128];
        for(int r=0;r<s.length();r++){
            char c=s.charAt(r);
            l=Math.max(last[c],l);
            len=Math.max(r-l+1, len);
            last[c]=r+1;
        }
        return len;
    }
}