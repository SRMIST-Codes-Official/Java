class Solution {
    public int maximum69Number (int num) {
        String s = String.valueOf(num);
        boolean flag=true;
        String n="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='6' && flag){
                n=n+'9';
                flag=false;
                continue;
            }
            n=n+s.charAt(i);
        }
        return Integer.parseInt(n);
    }
}