class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] pos=new int[nums.length/2];
        int[] neg=new int[nums.length/2];
        int p=0;
        int n=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                pos[p++]=nums[i];
            }else{
                neg[n++]=nums[i];
            }
        }
        int[] res=new int[nums.length];
        p=0;
        n=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                res[i]=pos[p++];
            }else{
                res[i]=neg[n++];
            }
        }
        return res;
    }
}