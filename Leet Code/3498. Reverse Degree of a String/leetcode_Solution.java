class Solution {
    public int reverseDegree(String s) {
        int p=0;
        for(int i=0;i<s.length();i++){
            p+=(26-(s.charAt(i)-'a'))*(i+1);
        }
        return p;
    }
}