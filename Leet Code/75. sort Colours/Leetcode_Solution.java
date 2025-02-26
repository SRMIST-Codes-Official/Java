class Solution {
    public void sortColors(int[] nums) {
        int z=0;
        int o=0;
        int t=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)z++;
            if(nums[i]==1)o++;
            if(nums[i]==2)t++;
        }
        int c=0;
        while(z>0){
            nums[c]=0;
            z--;
            c++;
        }
        while(o>0){
            nums[c]=1;
            o--;
            c++;
        }
        while(t>0){
            nums[c]=2;
            t--;
            c++;
        }
        //return nums;
    }
}