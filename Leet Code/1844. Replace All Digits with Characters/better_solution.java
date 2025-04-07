class Solution {
    public String replaceDigits(String s) {
        char[] arr = s.toCharArray();
        for(int i=1;i<s.length();i=i+2){
            arr[i]=(char)(s.charAt(i-1)+(s.charAt(i)-'0'));
        }
        return String.valueOf(arr);
    }
}
