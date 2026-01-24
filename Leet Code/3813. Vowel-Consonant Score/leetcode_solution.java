class Solution {
    public int vowelConsonantScore(String s) {
        char[] l=s.toCharArray();
        int v=0;
        int c=0;
        for(int i=0;i<l.length;i++){
            if(Character.isLetter(l[i])){
                if(l[i]=='a' || l[i]=='e' || l[i]=='i' || l[i]=='o' || l[i]=='u'){
                    v++;
                }else{
                    c++;
                }
            }
        }
        if(c==0){
            return 0;
        }
        return (int)Math.floor(v/c);

    }
}