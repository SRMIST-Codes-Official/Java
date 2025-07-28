class Solution {
    public int countHillValley(int[] nums) {
        int c=0;
        int[] arr = new int[nums.length];
        arr[0]=nums[0];
        int j=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=arr[j]){
                arr[++j]=nums[i];
            }
        }
        for(int i=1;i<j;i++){
            if((arr[i-1]<arr[i] && arr[i]>arr[i+1])  || (arr[i-1]>arr[i] && arr[i]<arr[i+1])){
                c++;
            }
        }
        
        return c;
    }
}