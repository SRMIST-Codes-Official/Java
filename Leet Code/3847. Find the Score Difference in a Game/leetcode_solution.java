class Solution {
    public int scoreDifference(int[] nums) {
        int fs=0;
        int ss=0;
        int c=0;
        boolean b=true;
        for(int i=0;i<nums.length;i++){
            c++;
            if(c%6==0){
                b=!b;
            }
            if(nums[i]%2!=0){
                b=!b;
            }
            if(b){
                fs+=nums[i];
            }else{
                ss+=nums[i];
            }
        }
        return fs-ss;
    }
}