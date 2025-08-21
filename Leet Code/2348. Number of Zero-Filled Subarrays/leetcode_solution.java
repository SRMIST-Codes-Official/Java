class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long count=0;
        int f=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                f++;
                count+=f;;
            }else{
                f=0;
            }
        }
        return count;
    }
}