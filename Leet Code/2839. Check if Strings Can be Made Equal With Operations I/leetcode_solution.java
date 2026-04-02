class Solution {
    public boolean canBeEqual(String s1, String s2) {
        if(s1.equals(s2)){
            return true;
        }
        char[] ch=s1.toCharArray();
        char temp=ch[3];
        ch[3]=ch[1];
        ch[1]=temp;
        if(new String(ch).equals(s2)){
            return true;
        }
        temp=ch[2];
        ch[2]=ch[0];
        ch[0]=temp;
        if(new String(ch).equals(s2)){
            return true;
        }
        char[] ch1=s1.toCharArray();
        temp=ch1[2];
        ch1[2]=ch1[0];
        ch1[0]=temp;
        if(new String(ch1).equals(s2)){
            return true;
        }
        return false;
    }
}