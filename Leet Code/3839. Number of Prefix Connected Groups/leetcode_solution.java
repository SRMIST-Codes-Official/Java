class Solution {
    public int prefixConnected(String[] words, int k) {
        int c=0;
        for(int i=0;i<words.length;i++){
            boolean con=false;
            if(words[i].length()<k){
                continue;
            }
            if(words[i]!=""){
                String st=words[i].substring(0,k);
                for(int j=i+1;j<words.length;j++){
                    if(words[j].startsWith(st)){
                        con =true;
                        words[j]="";
                    }
                }
                if(con){
                    c++;
                }
            }
        }
        return c;
    }
}