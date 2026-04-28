class Solution {
    public int compareBitonicSums(int[] nums) {
        long as=0;
        long ds=0;
        int i=0;
        for(i=0;i<nums.length-1;i++){
            as+=nums[i];
            if(nums[i]>nums[i+1]){
                break;
            }
        }
        for(;i<nums.length;i++){
            ds+=nums[i];
        }
        if(as>ds){
            return 0;
        }else if(as==ds){
            return -1;
        }
        return 1;
    }
}