class Solution {
    public int findPermutationDifference(String s, String t) {
        int d=0;
        for(int i=0;i<s.length();i++){
            d+=Math.abs(s.indexOf(s.charAt(i))-t.indexOf(s.charAt(i)));
        }
        return d;
    }
}