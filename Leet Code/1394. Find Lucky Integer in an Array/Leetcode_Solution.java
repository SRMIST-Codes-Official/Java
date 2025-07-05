class Solution {
    public int findLucky(int[] arr) {
        Arrays.sort(arr);
        int n=arr[0];
        int c=1;
        int r=-1;
        for(int i=1;i<arr.length;i++){
            if(n==arr[i]){
                c++;
            }else{
                if(c==arr[i-1]){
                    r= arr[i-1];
                }
                c=1;
                n=arr[i];
            }
        }if(c==arr[arr.length-1]){
            return arr[arr.length-1];
        }
        return r;
    }
}