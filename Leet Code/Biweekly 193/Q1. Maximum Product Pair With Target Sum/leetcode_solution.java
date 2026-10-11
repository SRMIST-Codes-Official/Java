class Solution {
    public int[] maxProductPair(int[] nums, int target) {
        int[] res=new int[2];
        res[0]=-1;
        res[1]=-1;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[i]>nums[j] && nums[i]+nums[j]==target){
                    if(nums[i]*nums[j]>max){
                        max=nums[i]*nums[j];
                        res[0]=i;
                        res[1]=j;
                    }
                }
            }
        }
        return res;
    }
}