class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String[] a1=s1.split(" ");
        String[] a2=s2.split(" ");
        HashMap<String, Integer> map= new HashMap<>();
        for(int i=0;i<a1.length;i++){
            map.put(a1[i],map.getOrDefault(a1[i],0)+1);
        }
        for(int i=0;i<a2.length;i++){
            map.put(a2[i],map.getOrDefault(a2[i],0)+1);
        }
        int c=0;
        for(String key:map.keySet()){
            if(map.get(key)==1){
                c++;
            }
        }
        String[] u=new String[c];
        int i=0;
        for(String key:map.keySet()){
            if(map.get(key)==1){
                u[i++]=key;
            }
        }
        return u;
    }
}