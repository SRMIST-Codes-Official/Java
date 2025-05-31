class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int i=0;
        int[] arr= new int[nums.length];
        for(int j=0;j<nums.length;j++){
            if(nums[j]<pivot){
                arr[i]=nums[j];
                i++;
            }
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j]==pivot){
                arr[i]=nums[j];
                i++;
            }
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j]>pivot){
                arr[i]=nums[j];
                i++;
            }
        }
        return arr;
        
    }
}