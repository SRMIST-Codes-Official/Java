class Solution {
    public int subarraySum(int[] nums) {
        int s=0;
        for(int i=0;i<nums.length;i++){
            int m=Math.max(0,i-nums[i]);
            for(int j=m;j<=i;j++){
                s+=nums[j];
            }
        }
        return s;
    }
}

