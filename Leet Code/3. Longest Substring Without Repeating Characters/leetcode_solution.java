class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set=new HashSet<>();
        int i=0;
        int j;
        int max=0;
        for(j=0;j<s.length();j++){
            if(set.contains(s.charAt(j))){
                max=Math.max(max, j-i);
                i++;
                j=i-1;
                set.clear();
            }else{
                set.add(s.charAt(j));
            }
        }
        max=Math.max(max,j-i);
        return max;
    }
}