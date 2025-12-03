class Solution {
    public int minElement(int[] nums) {
        int min=1001;
        for(int i=0;i<nums.length;i++){
            nums[i]=sum(nums[i]);
            min=Math.min(min,nums[i]);
        }
        return min;
    }
    int sum(int n){
        int s=0;
        while(n>0){
            s=s+(n%10);
            n=n/10;
        }
        return s;
    }
}