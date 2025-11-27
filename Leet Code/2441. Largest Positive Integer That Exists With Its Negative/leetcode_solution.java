class Solution {
    public int findMaxK(int[] nums) {
            Arrays.sort(nums);
            for(int i=nums.length-1;i>=0;i--){
                for(int j=0;j<nums.length;j++){
                    if(nums[j]*-1 == nums[i]){
                        return nums[i];
                    }
                    if(nums[j]>0){
                        break;
                    }
                }
            }
            return -1;
    }
}