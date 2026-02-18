class Solution {
    public int prefixConnected(String[] words, int k) {
        HashMap <String, Integer> map=new HashMap<>();
        for(int i=0;i<words.length;i++){
            if(words[i].length()<k){
                continue;
            }
            String s=words[i].substring(0,k);
            map.put(s, map.getOrDefault(s,0)+1);
        }
        int c=0;
        for(Map.Entry<String, Integer> e: map.entrySet()){
            if(e.getValue()>1){
                c++;
            }
        }
        return c;
    }
}