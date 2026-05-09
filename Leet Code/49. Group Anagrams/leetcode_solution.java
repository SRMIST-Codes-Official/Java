class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map=new HashMap<>();
        for(String s:strs){
            int[] count=new int[26];
            for(char c: s.toCharArray()){
                count[c-'a']++;
            }
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<26;i++){
                sb.append("#");
                sb.append(count[i]);
            }
            String key=sb.toString();
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(s);
        }
        return new ArrayList(map.values());

    }
}