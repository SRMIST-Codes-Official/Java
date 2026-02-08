class Solution {
    public String reverseWords(String s) {
        String n="";
        String[] arr= s.split(" ");
        for(int i=0;i<arr.length;i++){
            n=n+" "+rev(arr[i]);
        }
        return n.trim();
    }
    String rev(String s){
        String u="";
        for(int i=0;i<s.length();i++){
            u=s.charAt(i)+u;
        }
        return u;
    }
}