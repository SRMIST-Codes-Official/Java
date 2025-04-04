class Solution {
    public boolean reportSpam(String[] message, String[] bannedWords) {
        int c=0;
        Set<String> bannedSet = new HashSet<>(Arrays.asList(bannedWords));
        for(String m : message){
            if(bannedSet.contains(m)){
                c++;
            }
            if(c>=2){
                return true;
            }
        }
        return false;
    }
}