class Solution {
    public int[] sumZero(int n) {
        int[] arr = new int[n];
        int j=1;
        if(n%2==0){
            for(int i=0;i<=n-1;i=i+2){
                arr[i]=j;
                arr[i+1]=-1*j;
                j++;
            }
        }else{
            for(int i=0;i<n-1;i=i+2){
                arr[i]=j;
                arr[i+1]=-1*j;
                j++;
            }
            arr[n-1]=0;
        }
        return arr;

    }
}