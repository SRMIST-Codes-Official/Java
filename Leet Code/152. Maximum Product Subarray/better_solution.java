class Solution {
    public int maxProduct(int[] nums) {
        int max=nums[0];
        int p=1;
        int s=1;
        for(int i=0;i<nums.length;i++){
            if(p==0){
                p=1;
            }
            if(s==0){
                s=1;
            }
            p*=nums[i];
            s=s*nums[nums.length-1-i];
            max=Math.max(max,Math.max(p,s));
        }
        return max;
    }
}