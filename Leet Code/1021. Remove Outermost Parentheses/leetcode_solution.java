class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder n = new StringBuilder();
        int b=0;
        for(char ch : s.toCharArray()){
            if(ch == '('){
                b++;
                if(b>1){
                n.append(ch);
            }
            }else{
                b--;
                if(b>0){
                n.append(ch);
            }
            }
        }
        return n.toString();
    }
}