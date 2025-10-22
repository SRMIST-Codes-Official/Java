class Solution {
    public int missingMultiple(int[] nums, int k) {
        Arrays.sort(nums);
        int c=k;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==k){
                k=k+c;
                continue;
            }else if(nums[i]<k){
                continue;
            }else{
                return k;
            }
        }
        return k;
    }
}