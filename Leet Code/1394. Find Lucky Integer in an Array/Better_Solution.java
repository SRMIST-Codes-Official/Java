class Solution {
    public int findLucky(int[] arr) {
        int[] num = new int[501];
        for(int i=0;i<arr.length;i++){
            num[arr[i]]++;
        }
        for(int i=500;i>0;i--){
            if(i==num[i]){
                return i;
            }
        }
        return -1;
    }
}