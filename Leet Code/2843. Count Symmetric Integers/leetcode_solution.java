class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int c=0;
        for(int i=low;i<=high;i++){
            if(sym(i)){
                c++;
            }
        }
        return c;
    }
    boolean sym(int n){
        int c=0;
        int temp=n;
        while(temp>0){
            temp=temp/10;
            c++;
        }
        if(c%2==1){
            return false;
        }
        int n1=n%((int)Math.pow(10,c/2));
        int n2=n/((int)Math.pow(10,c/2));;
        int s1=0;
        int s2=0;
        while(n1>0 || n2>0){
            int d1=n1%10;
            int d2=n2%10;
            s1+=d1;
            s2+=d2;
            n1=n1/10;
            n2=n2/10;
        }
        if (s1==s2){
            return true;
        }
        return false;
    }
}