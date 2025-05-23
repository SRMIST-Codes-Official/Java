class Solution {
    public int[] shuffle(int[] nums, int n) {
        int [] arr =new int[2*n];
        int j=0;
        for(int i=0;i<2*n;i=i+2){
            arr[i]=nums[j];
            j++;
        }
        for(int i=1;i<2*n;i=i+2){
            arr[i]=nums[j];
            j++;
        }
        return arr;
    }
}