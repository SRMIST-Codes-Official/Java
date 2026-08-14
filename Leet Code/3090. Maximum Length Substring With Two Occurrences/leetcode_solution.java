class Solution {
    public int maximumLengthSubstring(String s) {
        int res=0;
        int l=0;
        HashMap<Character, Integer> map=new HashMap<>();
        for(int r=0;r<s.length();r++){
            char c=s.charAt(r);
            if(!map.containsKey(c) || (map.containsKey(c) && map.get(c)==0)){
                map.put(c, 1);
            }else{
                if(map.get(c)<2){
                    map.put(c,map.get(c)+1);
                }else{
                    while(map.get(c)>=2){
                        map.put(s.charAt(l),map.get(s.charAt(l))-1);
                        l++;
                    }
                    map.put(c, map.get(c)+1);
                }
            }
            res=Math.max(res, r-l+1);
        }
        return res;
    }
}