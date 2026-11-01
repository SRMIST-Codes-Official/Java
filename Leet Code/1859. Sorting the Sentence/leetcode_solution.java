class Solution {
    public String sortSentence(String s) {
        String[] arr=new String[s.split(" ").length];
        String[] sent=s.split(" ");
        for(String i: sent){
            int idx=i.charAt(i.length()-1) - '0';
            arr[idx-1]=i.substring(0, i.length()-1);
        }
        return String.join(" ", arr).trim();
    }
}