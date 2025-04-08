class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length()<26){
            return false;
        }
        int c=96;
        for(int i=97;i<=122;i++){
            for(int j=0;j<sentence.length();j++){
                if((int)sentence.charAt(j)==i){
                    c++;
                    break;
                }
            }
            if(c!=i){
                return false;
            }
        }
        return true;
    }
}