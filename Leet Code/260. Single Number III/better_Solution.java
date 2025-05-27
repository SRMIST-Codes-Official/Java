class Solution {
    public int[] singleNumber(int[] nums) {
        int[] n= new int[2];
        int k=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i==nums.length-1 && nums[i]!=nums[i-1]){
                n[k]=nums[i];
                k++;
            }
            else if(nums[i]==nums[i+1]){
                i++;
            }else{
                n[k]=nums[i];
                k++;
            }
        }
        return n;
    }
}