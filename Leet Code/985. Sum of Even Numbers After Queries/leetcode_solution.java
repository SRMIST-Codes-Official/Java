class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int sum=0;
        int[] arr=new int[queries.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                sum+=nums[i];
            }
        }
        for(int i=0;i<queries.length;i++){
            if(nums[queries[i][1]]%2==0){
                sum-=nums[queries[i][1]];
            }
            nums[queries[i][1]]=nums[queries[i][1]]+queries[i][0];
            if(nums[queries[i][1]]%2==0){
                sum+=nums[queries[i][1]];
            }
            arr[i]=sum;
        }
        return arr;
    }
}