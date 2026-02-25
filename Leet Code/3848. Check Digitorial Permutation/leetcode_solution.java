class Solution {
    public boolean isDigitorialPermutation(int n) {
        int s=0;
        int temp=n;
        while(temp>0){
            int d=temp%10;
            s+=fact(d);
            temp=temp/10;
        }
        if(s==n){
            return true;
        }
        HashMap<Integer, Integer> m1=new HashMap<>();
        HashMap<Integer, Integer> m2=new HashMap<>();
        while(n>0){
            int d=n%10;
            m1.put(d, m1.getOrDefault(d,0)+1);
            n=n/10;
        }
        while(s>0){
            int d=s%10;
            m2.put(d, m2.getOrDefault(d,0)+1);
            s=s/10;
        }
        if(m1.equals(m2)){
            return true;
        }
        return false;
        
    }
    int fact(int a){
        int p=1;
        for(int i=2;i<=a;i++){
            p=p*i;
        }
        return p;
    }
}