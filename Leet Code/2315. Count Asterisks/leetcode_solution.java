class Solution {
    public int countAsterisks(String s) {
       int c=0;
       boolean b =true;
       for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='|'){
            b=!b;
        }
        if(b && s.charAt(i)=='*'){
            c++;
        }
       }
       return c; 
    }
}