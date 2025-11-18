class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int c = 0;
        int i=0;
        for ( i = 0; i < nums.length; i++) {
            if(nums[i]==1){
                break;
            }
        }
        for(i=i+1;i<nums.length;i++){
            if(nums[i]==0){
                c++;
            }else{
                if(c<k){
                    return false;
                }
                c=0;
            }
        }
        return true;
    }
}