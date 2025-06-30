class Solution {
    public int findLHS(int[] nums) {
        int c=0;
        int f=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]-nums[i]==1){
                    c=j-i+1;
                }
            }
            if(c>f){
                f=c;
            }
           
        }
        return f;
    }
}