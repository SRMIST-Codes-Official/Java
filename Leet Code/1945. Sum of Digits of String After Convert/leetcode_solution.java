class Solution {
    public int getLucky(String s, int k) {
        int n=0;
        for(int i=0;i<s.length();i++){
            int dig=s.charAt(i)-'a'+1;
            while(dig>0){
                int d=dig%10;
                n=n+d;
                dig=dig/10;
            }
        }
        for(int i=1;i<k;i++){
            int sum=0;
            while(n>0){
                int d=n%10;
                sum=sum+d;
                n=n/10;
            }
            n=sum;
        }
        return n;
    }
}