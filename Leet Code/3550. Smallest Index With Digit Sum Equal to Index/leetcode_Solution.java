class Solution {
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(i==digsum(nums[i])){
                return i;
            }
        }
        return -1;
    }
    int digsum(int n){
        int s=0;
        while(n>0){
            int d=n%10;
            s=s+d;
            n=(int)n/10;
        }
        return s;
    }
}