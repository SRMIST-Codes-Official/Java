class Solution {
    public int maximizeExpressionOfThree(int[] nums) {
        int m=nums[0];
        int m2=-101;
        int min=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>=m){
                m2=m;
                m=nums[i];
            }else if(m2<nums[i]){
                m2=nums[i];
            }
            if(nums[i]<min){
                min=nums[i];
            }
        }
        return m+m2-min;
    }
}