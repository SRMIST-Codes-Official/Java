class Solution {
    public int maxProductDifference(int[] nums) {
        int min1=10001;
        int min2=10001;
        int max1=0;
        int max2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=min1){
                min2=min1;
                min1=nums[i];
            }else if(min2>nums[i]){
                min2=nums[i];
            }
            if(nums[i]>=max1){
                max2=max1;
                max1=nums[i];
            }else if(nums[i]>max2){
                max2=nums[i];
            }
        }
        return (max1*max2)-(min1*min2);
    }
}