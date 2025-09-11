class Solution {
    public String removeTrailingZeros(String num) {
        int z=-1;
        for(int i=num.length()-1;i>=0;i--){
            if(num.charAt(i)=='0'){
                z=i;
            }else{
                break;
            }
        }
        if(z==-1){
            return num;
        }
        String n=num.substring(0,z);
        return n;
    }
}