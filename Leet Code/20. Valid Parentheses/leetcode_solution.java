class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char t = s.charAt(i);
            if (t == '(' || t == '{' || t == '[') {
                st.push(t);
            } else {
                if (st.isEmpty()) {
                    return false;
                }
                char p = st.pop();
                if ((t == ')' && p == '(') || (t == '}' && p == '{') || (t == ']' && p == '[')) {
                    continue;
                } else {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}