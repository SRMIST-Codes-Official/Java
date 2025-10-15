class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> s= new ArrayList<>();
        s.add(words[0]);
        String c=words[0];
        for(int i=1;i<words.length;i++){
            if(!anagram(c,words[i])){
                c=words[i];
                s.add(words[i]);
            }
        }
        return s;
    }
    boolean anagram(String s1, String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        int[] s1c=new int[26];
        int[] s2c=new int[26];
        for(int i=0;i<s1.length();i++){
            s1c[s1.charAt(i)-'a']++;
            s2c[s2.charAt(i)-'a']++;
        }
        return Arrays.equals(s1c, s2c);
    }
}