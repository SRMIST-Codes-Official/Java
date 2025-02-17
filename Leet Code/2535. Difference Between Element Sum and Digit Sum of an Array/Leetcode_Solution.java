class Solution {
    public int differenceOfSum(int[] nums) {
        int s1=0;
        int s2=0;
        for(int i=0;i<nums.length;i++){
            s1=s1+nums[i];
            s2= s2 + sum(nums[i]);
        }
        return Math.abs(s1-s2);
    }
    int sum(int n){
        int d=0;
        int s=0;
        while(n>0){
            d=n%10;
            s=s+d;
            n=n/10;
        }
        return s;
    }
}