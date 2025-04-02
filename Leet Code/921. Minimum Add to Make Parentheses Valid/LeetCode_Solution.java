class Solution {
    public int minAddToMakeValid(String s) {
        int o=0;
        int c=0;
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '('){
                o++;
            }else{
                c++;
            }
            if(c>o){
                count++;
                c--;
            }
        }
        return count+Math.abs(o-c);
    }
}