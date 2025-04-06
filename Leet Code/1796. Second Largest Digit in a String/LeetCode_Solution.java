class Solution {
    public int secondHighest(String s) {
        int [] num= new int[s.length()];
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                num[i]=Character.getNumericValue(s.charAt(i));
            }else{
                num[i]=-1;
            }
        }
        int l=-1;
        int sl=-1;
        for(int i=0;i<num.length;i++){
            if(num[i]>l){
                sl=l;
                l=num[i];
            }
            if(num[i]>sl && num[i]<l){
                sl=num[i];
            }
        }
        return sl;
    }
}