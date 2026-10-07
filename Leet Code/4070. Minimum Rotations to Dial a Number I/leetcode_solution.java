class Solution {
    public int minRotations(String s) {
        int c=0;
        int cur=0;
        for(char ch: s.toCharArray()){
            int d=ch-'0';
            int dig=Math.abs(d-cur);
            c+=Math.min(dig, 10-dig);
            cur=d;
        }
        return c;
    }
}