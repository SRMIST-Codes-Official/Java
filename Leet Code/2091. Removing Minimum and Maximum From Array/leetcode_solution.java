class Solution {
    public int minimumDeletions(int[] nums) {
        int n=nums.length;
        if(n<=2){
            return n;
        }
        int min=Integer.MAX_VALUE;
        int minidx=-1;
        int max=Integer.MIN_VALUE;
        int maxidx=-1;
        for(int i=0;i<n;i++){
            if(nums[i]>max){
                max=nums[i];
                maxidx=i;
            }
            if(nums[i]<min){
                min=nums[i];
                minidx=i;
            }
        }
        int l=Math.max(minidx, maxidx)+1;
        int r=Math.max(n-maxidx, n-minidx);
        int b=Math.min(minidx, maxidx)+1 + n-Math.max(minidx,maxidx);
        return Math.min(l,Math.min(r,b));
    }
}