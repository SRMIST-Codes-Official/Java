class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int l=0;
        int r=1;
        int f=0;
        while(r<nums.length){
            int diff=nums[r]-nums[l];
            if(diff==1){
                f=Math.max(f,r-l+1);
            }
            if(diff<=1){
                r++;
            }else{
                l++;
            }
        }
        return f;
    }
}