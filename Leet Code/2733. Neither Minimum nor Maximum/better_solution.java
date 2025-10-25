class Solution {
    public int findNonMinOrMax(int[] nums) {
        if(nums.length < 3){
            return -1;
        }
        int a=nums[0];
        int b=nums[1];
        int c=nums[2];
        if((a<b && b<c) || (a>b && b>c)){
            return b;
        }
        if((b<c && c<a) || (b>c && c>a)){
            return c;
        }
        return a;
    }
}