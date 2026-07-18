class Solution {
    public int maxValidPairSum(int[] nums, int k) {
        int max=0;
        int m=0;
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            arr[i]=max;
        }
        for(int j=nums.length-1;j>=k;j--){
            m=Math.max(m, nums[j]+arr[j-k]);
        }
        return m;
    }
}