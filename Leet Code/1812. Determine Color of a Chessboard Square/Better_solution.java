class Solution {
    public boolean squareIsWhite(String s) {
        return (s.charAt(0) - 'a' + 1 + s.charAt(1) - '0')%2!=0;  
    }
}