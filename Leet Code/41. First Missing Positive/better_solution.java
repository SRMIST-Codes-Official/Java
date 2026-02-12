class Solution {
    public int firstMissingPositive(int[] nums) {
        int[] arr= new int[nums.length+1];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0 && nums[i]<=nums.length){
                arr[nums[i]]++;
            }
        }
        int c=nums.length+1;
        for(int i=1;i<nums.length+1;i++){
            if(arr[i]==0){
                c=i;
                break;
            }
        }
        return c;
    }
}