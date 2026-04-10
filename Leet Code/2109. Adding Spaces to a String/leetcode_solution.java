class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder res = new StringBuilder();
        int prev = 0;
        for(int i = 0; i < spaces.length; i++){
            res.append(s.substring(prev, spaces[i]));
            res.append(" ");
            prev = spaces[i];
        }
        res.append(s.substring(prev));
        return res.toString();
    }
}