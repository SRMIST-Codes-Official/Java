class Solution {
    public int findMiddleIndex(int[] nums) {
        int s=0;
        int ls=0;
        for(int i=0;i<nums.length;i++){
            s+=nums[i];
        }
        s=s-nums[0];
        if(s==0){
            return 0;
        }
        for(int i=1;i<nums.length;i++){
            ls+=nums[i-1];
            s=s-nums[i];
            if(ls==s){
                return i;
            }
        }
        return -1;
    }
}