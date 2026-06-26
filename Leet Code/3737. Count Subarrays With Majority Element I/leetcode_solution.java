class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            int f=0;
            for(int j=i;j<nums.length;j++){
                if(nums[j]==target){
                    f++;
                }
                if(f>(j-i+1)/2){
                    c++;
                }
            }
        }
        return c;
    }
}