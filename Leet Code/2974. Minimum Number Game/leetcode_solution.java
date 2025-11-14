class Solution {
    public int[] numberGame(int[] nums) {
        int[] arr =new int[nums.length];
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i=i+2){
            arr[i]=nums[i+1];
            arr[i+1]=nums[i];
        }
        return arr;
    }
}