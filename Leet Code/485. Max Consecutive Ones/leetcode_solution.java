class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0;
        int l=0;
        int r=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                r++;
            }else{
                max=Math.max(max, r-l);
                r=i;
                l=i;
            }
        }
        max=Math.max(max, r-l);
        return max;
    }
}