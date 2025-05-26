class Solution {
    public int[] singleNumber(int[] nums) {
        int[] n= new int[2];
        int k=0;
        for(int i=0;i<nums.length;i++){
            int c=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    c++;
                }
            }
            if(c==1){
                n[k]=nums[i];
                k++;
            }
        }
        return n;
    }
}