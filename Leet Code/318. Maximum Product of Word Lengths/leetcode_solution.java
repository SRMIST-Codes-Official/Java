class Solution {
    public int maxProduct(String[] words) {
        int p=0;
        for(int i=0;i<words.length;i++){
            for(int j=i+1;j<words.length;j++){
                if(words[i].length()*words[j].length() > p){
                    if(!common(words[i],words[j])){
                        p=words[i].length()*words[j].length();
                    }
                }
            }
        }
        return p;
    }
    boolean common(String a, String b){
        for(int i=0;i<a.length();i++){
            if(b.contains(a.charAt(i)+"")){
                return true;
            }
        }
        return false;
    }
}