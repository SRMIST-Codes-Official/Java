class Solution {
    public String smallestPalindrome(String s) {
        int n=s.length();
        char[] res=new char[n];
        int[] l= new int[26];
        for(char c: s.toCharArray()){
            l[c-'a']++;
        }
        int j=0;
        for(int i=0;i<26;i++){
            if(l[i]==1){
                res[n/2]=(char)(i+'a');
            }else if(l[i]>=2){
                res[j]=(char)(i+'a');
                res[n-j-1]=(char)(i+'a');
                l[i]=l[i]-2;
                i--;
                j++;
            }

        }
        return new String(res);
    }
}