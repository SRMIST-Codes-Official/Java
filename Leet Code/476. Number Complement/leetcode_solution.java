class Solution {
    public int findComplement(int num) {
        String b=Integer.toBinaryString(num);
        String bin="";
        for(int i=0;i<b.length();i++){
            if(b.charAt(i)=='0'){
                bin=bin+'1';
            }else{
                bin=bin+'0';
            }
        }
        return Integer.parseInt(bin, 2);
    }
}