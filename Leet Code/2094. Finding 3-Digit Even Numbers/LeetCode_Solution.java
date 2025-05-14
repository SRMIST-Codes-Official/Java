class Solution {
    public int[] findEvenNumbers(int[] digits) {
        int[] arr= new int[999];
        int j=0;
        for(int i=100;i<=998;i=i+2){
            if(check(i,digits)){
                arr[j]=i;
                j++;
            }
        }
        int[] r=new int[j];
        for(int i=0;i<j;i++){
            r[i]=arr[i];
        }
        Arrays.sort(r);
        return r;
    }
    boolean check(int n, int[] digits){
        int f=n%10;
        int s=(n/10)%10;
        int l=(n/100);
        int c=0;
        for(int i=0;i<digits.length;i++){
            if(digits[i]==f){
                c++;
                f=-1;
            }
            else if(digits[i]==s){
                c++;
                s=-1;
            }else  if(digits[i]==l){
                c++;
                l=-1;
            }
        }
        if(c==3){
            return true;
        }
        return false;
    }
}