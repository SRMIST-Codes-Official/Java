class Solution {
    public int maxProduct(int[] nums) {
        int m=0;
        int sm=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>m){
                sm=m;
                m=nums[i];
            }else if(nums[i]>sm){
                sm=nums[i];
            }
        }
        return (m-1)*(sm-1);
    }
}