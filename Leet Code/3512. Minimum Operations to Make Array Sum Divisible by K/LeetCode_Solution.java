class Solution {
    public int minOperations(int[] nums, int k) {
        int sum=0;
        int l=nums.length;
        for(int i=0;i<l;i++){
            sum+=nums[i];
        }
        return sum%k;
    }
}