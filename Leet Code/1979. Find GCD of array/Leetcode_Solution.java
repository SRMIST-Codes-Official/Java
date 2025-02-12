class Solution {
    public int findGCD(int[] nums) {
        int s=nums[0];
        int l=nums[0];
        int gcd=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<s){
                s=nums[i];
            }
            if(nums[i]>l){
                l=nums[i];
            }
        }
        for(int i=l;i>0;i--){
            if(l%i==0 && s%i==0){
                gcd=i;
                break;
            }
        }
        return gcd;
    }
}