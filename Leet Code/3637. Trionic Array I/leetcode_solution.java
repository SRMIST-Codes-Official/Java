class Solution {
    public boolean isTrionic(int[] nums) {
        int p=0;
        int q=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<=nums[i-1]){
                p=i-1;
                break;
            }
        }
        if(p==0){
            return false;
        }
        for(int i=p+1;i<nums.length;i++){
            if(nums[i]>=nums[i-1]){
                q=i-1;
                break;
            }
        }
        if(q==0){
            return false;
        }
        for(int i=q+1;i<nums.length;i++){
            if(nums[i]<=nums[i-1]){
                return false;
            }
        }
        if(0<p && p<q && q<nums.length-1){
            return true;
        }
        return false;
    }
}