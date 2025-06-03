class Solution {
    public String replaceWords(List<String> list, String sentence) {
        String[] words = sentence.split(" ");
        String[] s=new String[words.length];
        list.sort((a, b) -> Integer.compare(a.length(), b.length()));
        for(int i=0;i<words.length;i++){
            for(int j=0;j<list.size();j++){
                int l=list.get(j).length();
                if(l>words[i].length()){
                    continue;
                }
                String sub=words[i].substring(0,l);
                if(sub.equals(list.get(j))){
                    s[i]=list.get(j);
                    break;
                }
            }
            if(s[i]== null){
                s[i]=words[i];
            }
        }
        String f = String.join(" ", s);
        return f;
    }
}