class Solution {
    public int minimumPushes(String word) {
        int[] temp=new int[26];
        for(int i=0;i<word.length();i++){
            temp[word.charAt(i)-'a']++;
        }
        Arrays.sort(temp);
        int c=1;
        int press=0;
        for(int i=25;i>=0;i--){
            if(temp[i]==0){
                break;
            }
            if(c<=8){
                press+=temp[i];
            }else if(c<=16){
                press+=temp[i]*2;
            }else if(c<=24){
                press+=temp[i]*3;
            }else{
                press+=temp[i]*4;
            }
            c++;
        }
        return press;
    }
}