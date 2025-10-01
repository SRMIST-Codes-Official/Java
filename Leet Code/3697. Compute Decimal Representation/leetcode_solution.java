class Solution {
    public int[] decimalRepresentation(int n) {
        int l=len(n);
        int z=zero(n);
        int t=1;
        int i=l-z-1;
        int[] arr= new int[l-z];
        while(n>0){
            int d=n%10;
            if(d!=0){
                arr[i]=d*t;
                i--;
            }
            t=t*10;
            n=n/10;
        }
        return arr;
    }
    int len(int n){
        int c=0;
        while(n>0){
            n=n/10;
            c++;
        }
        return c;
    }
    int zero(int n){
        int c=0;
        while(n>0){
            int d=n%10;
            if(d==0){
                c++;
            }
            n=n/10;
        }
        return c;
    }
}