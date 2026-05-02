class Solution {
    public boolean isSumEqual(String f, String s, String t) {
        int v1=0;
        int v2=0;
        int v3=0;
        for(int i=0;i<f.length();i++){
            int d=f.charAt(i)-'a';
            v1=(v1*10)+d;
        }
        for(int i=0;i<s.length();i++){
            int d=s.charAt(i)-'a';
            v2=(v2*10)+d;
        }
        for(int i=0;i<t.length();i++){
            int d=t.charAt(i)-'a';
            v3=(v3*10)+d;
        }
        if(v1+v2 == v3){
            return true;
        }
        return false;
    }
}