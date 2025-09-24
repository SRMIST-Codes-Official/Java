class Solution {
    public int evenNumberBitwiseORs(int[] nums) {
        int n=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                n= n|nums[i];
            }
        }
        return n;
    }
}