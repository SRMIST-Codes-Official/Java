class Solution {
    public int countSpecialIntegers(int[] nums) {
        int c=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==-1){
                continue;
            }
            boolean together=true;
            boolean add=true;
            for(int j=i+1;j<n;j++){
                if(together==true && nums[j]==nums[i]){
                    nums[j]=-1;
                    continue;
                }
                else if(together==true && nums[j]!=nums[i]){
                    together=false;
                }
                else if(together==false && nums[i]==nums[j]){
                    nums[j]=-1;
                    add=false;
                }
            }
            if(add==true){
                c++;
            }
        }
        return c;
    }
}