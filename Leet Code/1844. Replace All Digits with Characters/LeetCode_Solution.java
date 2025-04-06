class Solution {
    public String replaceDigits(String s) {
        String n="";
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                int a=Character.getNumericValue(s.charAt(i));
                n=n+((char)(s.charAt(i-1)+a));
            }else{
                n=n+s.charAt(i);
            }
        }
        return n;
    }
}