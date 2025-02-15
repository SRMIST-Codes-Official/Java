class Solution {
    public int missingNumber(int[] nums) {
        int c=0;
        int t=nums.length;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[j]!=i){
                    c++;
                }
            }
            if(c==nums.length){
                t=i;
                break;
            }
            c=0;
        }
        return t;
    }
}