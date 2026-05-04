class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;
        }
        String n=s+s;
        if(n.contains(goal)){
            return true;
        }
        return false;
    }
}