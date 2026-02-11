class Solution {
    public int[] plusOne(int[] digits) {
        int n=digits.length;
        boolean f =true;
        for(int i=0;i<n;i++){
            if(digits[i]!=9){
                f=false;
                break;
            }
        }
        if(f){
            n++;
        }
        int[] arr=new int[n];
        if(f){
            arr[0]=1;
            return arr;
        }
        int j=n-1;
        while(digits[j]==9){
            digits[j]=0;
            j--;
        }
        digits[j]++;
        return digits;
    }
}