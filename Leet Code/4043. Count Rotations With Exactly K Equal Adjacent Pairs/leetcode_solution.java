class Solution {
    public int countRotations(String s, int k) {
        int c=0;
        String str=s+s;
        for(int i=0;i<s.length();i++){
            int count=0;
            for(int j=i;j<i+s.length()-1;j++){
                if(str.charAt(j)==str.charAt(j+1)){
                    count++;
                }
            }
            if(count==k){
               c++;
            }
        }
        return c;
    }
}