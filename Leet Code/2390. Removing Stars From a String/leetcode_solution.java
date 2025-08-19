class Solution {
    public String removeStars(String s) {
        Stack <Character> st=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='*'){
                st.pop();
            }else{
                st.push(ch);
            }
        }
        String n="";
        while(!st.isEmpty()){
            n=st.pop()+n;
        }
        return n;
    }
}