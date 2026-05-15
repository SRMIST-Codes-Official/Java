class Solution {
    public boolean isGood(int[] nums) {
       int max=0;
       int[] arr=new int[nums.length-1];
       for(int i=0;i<nums.length;i++){
        if(nums[i]>nums.length-1){
            return false;
        }
        arr[nums[i]-1]++;
       }
       if(arr[arr.length-1]!=2){
        return false;
       }
       for(int i=0;i<nums.length-2;i++){
        if(arr[i]!=1){
            return false;
        }
       }
       return true;
    }
}