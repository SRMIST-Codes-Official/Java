class Solution {
    public char kthCharacter(int k) {
        String s="a";
        while(s.length()<=k){
            int l=s.length();
            for(int i=0;i<l;i++){
                s=s+nextletter(s.charAt(i));
            }
        }
        return s.charAt(k-1);
    }
    char nextletter(char input){
        return (input == 'z') ? 'a' : (char)(input + 1);
    }
}