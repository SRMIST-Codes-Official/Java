class Solution {
    public int countGoodRotations(int[] nums) {
        long total=0;
        long fs=0;
        int c=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            total+=nums[i];
            if(i<n/2){
                fs+=nums[i];
            }
        }
        for(int i=0;i<n;i++){
            int idx=(n/2)+i;
            if(idx>=n){
                idx=(n/2)+i-n;
            }
            fs=fs-nums[i]+nums[idx];
            if(fs>total-fs){
                c++;
            }
        }
        return c;
    }
}