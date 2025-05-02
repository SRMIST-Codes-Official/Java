class Solution {
    public int findNumbers(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(count(nums[i])){
                c++;
            }
        }
        return c;
    }
    boolean count(int n){
        int c=0;
        while(n>0){
            n=n/10;
            c++;
        }
        if(c%2==0){
            return true;
        }
        return false;
    }
}