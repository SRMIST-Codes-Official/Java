//5ms sollution
class Solution {
    public int maxDistinct(String s) {
        int[] arr=new int[26];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;
        }
        int c=0;
        for(int i=0;i<26;i++){
            if(arr[i]>0){
                c++;
            }
        }
        return c;
    }
}