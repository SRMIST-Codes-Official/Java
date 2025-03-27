class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        s = s.replaceAll("\\s+", " ");
        String arr[]=s.split(" ");
        String n="";
        for(int i=arr.length-1;i>=0;i--){
            n=n+arr[i]+" ";
        }
        return n.trim();
    }
}
