class Solution {
    public int countSubstrings(String s) {
        int c=0;
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length()+1;j++){
                if(palindrome(s.substring(i,j))){
                    c++;
                }
            }
        }
        return c;
    }
    boolean palindrome(String st){
        for(int i=0;i<st.length()/2;i++){
            if(st.charAt(i)!=st.charAt(st.length()-1-i)){
                return false;
            }
        }
        return true;
    }
}