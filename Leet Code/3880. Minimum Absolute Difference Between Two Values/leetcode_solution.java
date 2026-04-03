class Solution {
    public int minAbsoluteDifference(int[] nums) {
        int c=101;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=1){
                continue;
            }
            for(int j=0;j<nums.length;j++){
                if(nums[j]!=2){
                    continue;
                }else{
                    c=Math.min(c,Math.abs(i-j));
                }
            }
        }
        if(c==101){
            return -1;
        }
        return c;
    }
}