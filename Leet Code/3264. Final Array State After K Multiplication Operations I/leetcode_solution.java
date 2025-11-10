class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        for(int i=0;i<k;i++){
            int min=minimum_num(nums);
            for(int j=0;j<nums.length;j++){
                if(nums[j]==min){
                    nums[j]=nums[j]*multiplier;
                    break;
                }
            }
        }
        return nums;
    }
    int minimum_num(int[] arr){
        int m=arr[0];
        for(int i=1;i<arr.length;i++){
            m=Math.min(m,arr[i]);
        }
        return m;
    }
}