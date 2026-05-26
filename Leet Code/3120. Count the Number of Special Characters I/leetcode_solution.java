class Solution {
    public int numberOfSpecialChars(String word) {
        int[] l = new int[26];
        int[] u = new int[26];
        for(char c : word.toCharArray()){
            if(Character.isLowerCase(c)){
                l[c-'a']++;
            } else {
                u[c-'A']++;
            }
        }
        int c = 0;
        for(int i=0;i<26;i++){
            if(l[i] > 0 && u[i] > 0){
                c++;
            }
        }
        return c;
    }
}