class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        String str="";
        for(int i=0;i<map.size();i++){
            str=str+len(map);
        }
        return str;
    }
    String len(HashMap<Character, Integer> map){
        int max=0;
        char maxc='\0';
        for(Map.Entry<Character, Integer> e: map.entrySet()){
            char key=e.getKey();
            int val=e.getValue();
            if(val>max){
                max=val;
                maxc=key;
            }
        }
        map.put(maxc,0);
        String s="";
        for(int i=0;i<max;i++){
            s=s+maxc;
        }
        return s;
    }
}