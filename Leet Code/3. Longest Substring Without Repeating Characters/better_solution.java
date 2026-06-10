class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0;
        int r=0;
        int len=0;
        HashMap<Character, Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            r=i;
            if(map.containsKey(c)){
                l=Math.max(l,map.get(c)+1);
            }
            len=Math.max(r-l+1, len);
            map.put(c,i);
        }
        return len;
    }
}