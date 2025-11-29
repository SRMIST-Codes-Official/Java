class Solution {
    public int[] numberOfPairs(int[] nums) {
        int pairs=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==-1){
                continue;
            }
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]==-1){
                    continue;
                }
                if(nums[i]==nums[j]){
                    pairs++;
                    nums[i]=-1;
                    nums[j]=-1;
                }
            }
        }
        int[] arr={pairs, nums.length-(pairs*2)};
        return arr;
    }
}