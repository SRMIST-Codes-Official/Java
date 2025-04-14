class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        StringBuilder sb = new StringBuilder(magazine);
        for(int i=0;i<ransomNote.length();i++){
            char c=ransomNote.charAt(i);
            int a=sb.indexOf(String.valueOf(c));
            if(a!=-1){
                sb.setCharAt(a, '*');
            }else{
                return false;
            }
        }
        return true;
    }
}