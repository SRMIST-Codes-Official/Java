class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int[] arr= new int[A.length];
        int[] res= new int[B.length];
        int c=0;
        for(int i=0;i<A.length;i++){
            arr[A[i]-1]++;
            arr[B[i]-1]++;
            if(arr[A[i]-1]==2){
                c++;
            }
            if(arr[B[i]-1]==2){
                c++;
            }
            if(A[i]==B[i]){
                c--;
            }
            res[i]=c;
        }
        return res;
    }
}