class Solution {
    public int maximumGap(int[] nums) {
        if(nums.length==1){
            return 0;
        }
        int d=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            d=Math.max(nums[i+1]-nums[i],d);
        }
        return d;
    }
}