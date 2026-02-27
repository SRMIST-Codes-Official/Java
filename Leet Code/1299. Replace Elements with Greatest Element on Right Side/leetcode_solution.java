class Solution {
    public int[] replaceElements(int[] arr) {
        int g=-1;
        int[] nums=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            nums[i]=g;
            if(arr[i]>g){
                g=arr[i];
            }
        }
        return nums;
    }
}