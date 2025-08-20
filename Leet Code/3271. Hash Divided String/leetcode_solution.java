class Solution {
    public String stringHash(String s, int k) {
        String[] str= new String[s.length()/k];
        String result="";
        for(int i=0, j=0;i<str.length;i++,j=j+k){
            str[i]=s.substring(j,j+k);
        }
        for(int i=0;i<str.length;i++){
            int sum=0;
            for(int j=0;j<k;j++){
                sum+= str[i].charAt(j)-'a';
            }
            char t=(char)('a'+sum%26);
            result=result+t; 
        }
        return result;
    }
}