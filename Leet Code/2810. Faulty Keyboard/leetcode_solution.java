class Solution {
    public String finalString(String s) {
        String st="";
        String rev="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='i'){
                st=st+s.charAt(i);
                rev=s.charAt(i)+rev;
            }else{
                String d=st;
                st=rev;
                rev=d;
            }
        }
        return st;
    }
}