class Solution {
    public String reversePrefix(String word, char ch) {
        String s="";
        int i=0;
        if(word.indexOf(ch)==-1){
            return word;
        }
        Stack<Character> st = new Stack<>();
        for(i=0;i<word.length();i++){
            st.push(word.charAt(i));
            if(word.charAt(i)==ch){
                break;
            }
        }
        while(!st.isEmpty()){
            s=s+st.pop();
        }
        for(i=i+1;i<word.length();i++){
            s=s+word.charAt(i);
        }
        return s;
    }
}