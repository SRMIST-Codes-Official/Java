class Solution {
    public int firstUniqueEven(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int f=0;
            if(nums[i]%2==0){
                for(int j=0;j<nums.length;j++){
                    if(nums[i]==nums[j]){
                        f++;
                    }
                }
                if(f==1){
                    return nums[i];
                }
            }
        }
        return -1;
    }
}