class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        int vowels=vc(words[0]);
        String r=words[0];
        for(int i=1;i<words.length;i++){
            if(vc(words[i]) == vowels){
                r=r+" "+rev(words[i]);
            }else{
                r=r+" "+words[i];
            }
        }
        return r;

    }
    int vc(String s){
        int c=0;
        for(int i=0;i<s.length();i++){
            if("aeiou".indexOf(s.charAt(i))!=-1){
                c++;
            }
        }
        return c;
    }
    String rev(String s){
        String r="";
        for(int i=0;i<s.length();i++){
            r=s.charAt(i)+r;
        }
        return r;
    }
}