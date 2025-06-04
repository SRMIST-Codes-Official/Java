class Solution {
    public String replaceWords(List<String> list, String sentence) {
        String[] words = sentence.split(" ");
        list.sort((a, b) -> Integer.compare(a.length(), b.length()));
        for(int i=0;i<words.length;i++){
            for(int j=0;j<list.size();j++){
                if(words[i].startsWith(list.get(j))){
                    words[i]=list.get(j);
                    break;
                }
            }
        }
        String f = String.join(" ", words);
        return f;
    }
}