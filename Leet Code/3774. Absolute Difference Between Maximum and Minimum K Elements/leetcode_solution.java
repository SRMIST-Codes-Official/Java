class Solution {
    public int absDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int l=0;
        int s=0;
        for(int i=0;i<k;i++){
            s=s+nums[i];
        }
        for(int i=nums.length-1;i>=nums.length-k;i--){
            l=l+nums[i];
        }
        return Math.abs(l-s);
    }
}