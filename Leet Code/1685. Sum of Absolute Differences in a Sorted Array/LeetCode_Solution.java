class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int[] arr=new int[nums.length];
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
        }
        int lsum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum-nums[i];
            lsum=lsum+nums[i];
            arr[i]=((nums[i]*(i+1))-lsum) + sum-(nums[i]*(nums.length-i-1));
        }
        return arr;
    }
}