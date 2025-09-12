class Solution {
    public int maxProduct(int n) {
        int s=(String.valueOf(n).length());
        int[] arr=new int[s];
        int i=0;
        while(n>0){
            int d=n%10;
            arr[i++]=d;
            n=n/10;
        }
        Arrays.sort(arr);
        return arr[s-1]*arr[s-2];
    }
}