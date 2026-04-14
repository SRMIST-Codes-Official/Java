class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            count+=countdig(nums[i],digit);
        }
        return count;
    }
    int countdig(int n, int x){
        int c=0;
        while(n>0){
            int d=n%10;
            if(d==x){
                c++;
            }
            n=n/10;
        }
        return c;
    }
}