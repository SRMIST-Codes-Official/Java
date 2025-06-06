class Solution {
    public int[] leftRightDifference(int[] nums) {
        int lsum=0;
        int rsum=0;
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            rsum=rsum+nums[i];
        }
        for(int i=0;i<nums.length;i++){
            rsum=rsum-nums[i];
            arr[i]=Math.abs(lsum-rsum);
            lsum=lsum+nums[i];
        }
        return arr;
    }
}