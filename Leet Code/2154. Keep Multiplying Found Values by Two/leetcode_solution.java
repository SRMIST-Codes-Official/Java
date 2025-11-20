class Solution {
    public int findFinalValue(int[] nums, int original) {
        boolean a=true;
        while(a){
            a=find(nums, original);
            if(a){
                original=original*2;
            }
        }
        return original;
    }
    boolean find(int[] nums, int o){
        for(int i=0;i<nums.length;i++){
            if(nums[i]==o){
                return true;
            }
        }
        return false;
    }
}