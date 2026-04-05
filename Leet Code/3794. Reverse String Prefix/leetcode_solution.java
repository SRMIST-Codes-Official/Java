class Solution {
    public String reversePrefix(String s, int k) {
        String s1=s.substring(0,k);
        String s2=s.substring(k);
        s1 = new StringBuilder(s1).reverse().toString();
        return s1+s2;
    }
}