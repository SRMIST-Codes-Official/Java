class Solution {
    public String trimTrailingVowels(String s) {
        int v=s.length();
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='a' ||s.charAt(i)=='e' ||s.charAt(i)=='i' ||s.charAt(i)=='o' ||s.charAt(i)=='u'){
                v=i;
            }else{
                break;
            }
        }
        String str=s.substring(0,v);
        return str;
    }
}