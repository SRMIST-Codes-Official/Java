class Solution {
    public List<String> commonChars(String[] words) {
       String s=words[0];
       ArrayList<String> l = new ArrayList<>();
       for(int i=0;i<s.length();i++){
        int v=0;
        for(int j=1;j<words.length;j++){
            if(words[j].indexOf(s.charAt(i)) !=-1){
                v++;
                words[j]=words[j].replaceFirst(String.valueOf(s.charAt(i)),"A");
            }
        }
        if(v==words.length-1){
            l.add(String.valueOf(s.charAt(i)));
        }
       }
       return l; 
    }
}