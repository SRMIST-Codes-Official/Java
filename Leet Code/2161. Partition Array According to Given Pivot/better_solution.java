class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] arr= new int[nums.length];
        int r=0;
        int l=0;
        for(int i=0;i<nums.length;i++){
            arr[i]=pivot;
            if(nums[i]<=pivot){
                r++;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]<pivot){
                arr[l++]=nums[i];
            }else if(nums[i]>pivot){
                arr[r++]=nums[i];
            }
        }
        return arr;
        
    }
}