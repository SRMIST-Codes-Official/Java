class Solution {
    public int subarraySum(int[] nums) {
        int s=0;
        int [] arr= new int[nums.length];
        arr[nums.length-1]=nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--){
            arr[i]=arr[i+1]+nums[i];
        }
        for(int i=0;i<nums.length;i++){
            int start=Math.max(0,i-nums[i]);
            if(i==nums.length-1){
                s+=arr[start];
            }else{
                s+=arr[start]-arr[i+1];
            }
        }
        return s;
    }
}