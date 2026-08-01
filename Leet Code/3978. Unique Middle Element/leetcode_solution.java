class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int l=nums.length;
        int n=nums[l/2];
        int c=0;
        for(int i=0;i<l;i++){
            if(nums[i]==n){
                c++;
            }
        }
        return c==1;
    }
}