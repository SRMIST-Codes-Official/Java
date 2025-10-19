class Solution {
    public int minimumOperations(int[] nums) {
        int c=0;
        int m=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]-m>0){
                m=nums[i];
                c++;
            }
        }
        return c;
    }
}