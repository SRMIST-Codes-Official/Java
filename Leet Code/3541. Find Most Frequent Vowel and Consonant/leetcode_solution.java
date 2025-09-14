class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character, Integer> h = new HashMap<>();
        for(char ch: s.toCharArray()){
            if(h.containsKey(ch)){
                h.put(ch, h.get(ch)+1);
            }else{
                h.put(ch,1);
            }
        }
        char con=' ';
        int cc=0;
        char v=' ';
        int vc=0;
        for(char key:h.keySet()){
            if(key=='a'|| key=='e'|| key=='i' || key=='o' || key=='u'){
                if(h.get(key)>vc){
                    v=key;
                    vc=h.get(key);
                }
            }else{
               if(h.get(key)>cc){
                    con=key;
                    cc=h.get(key);
                } 
            }
        }
        return vc+cc;
    }
}