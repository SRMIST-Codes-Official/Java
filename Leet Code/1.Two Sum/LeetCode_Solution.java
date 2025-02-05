class Solution {
    public int[] twoSum(int[] nums, int target) {
        int j=0;
        int i=0;
        int s=0;
        for(  i=0;i<nums.length;i++){
            for( j=i+1;j<nums.length;j++){
                 s= nums[i] + nums[j];
                if(s==target){
                    return new int[]{i,j};
                }
                s=0;
            }
        }
        return  new int[]{};
    }
}