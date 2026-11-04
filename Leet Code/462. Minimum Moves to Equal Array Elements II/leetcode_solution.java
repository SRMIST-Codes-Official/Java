class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int v=nums[nums.length/2];
        int c=0;
        for(int i=0;i<nums.length;i++){
            c+=Math.abs(v-nums[i]);
        }
        return c;
    }
}