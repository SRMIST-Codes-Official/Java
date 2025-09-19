class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
        Arrays.sort(nums);
        int u=unique(nums);
        if(u<k){
            k=u;
        }
        int[]  arr=new int[k];
        int j=0;
        if(k==0){
            return arr;
        }
        int prev=nums[nums.length-1];
        arr[j++]=prev;
        k--;
        for(int i=nums.length-2;i>=0;i--){
            if(k==0){
                break;
            }
            if(nums[i]==prev){
                continue;
            }else{
                arr[j++]=nums[i];
                k--;
                prev=nums[i];
            }
        }
        return arr;
    }
    int unique(int[] arr){
        int count=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[i-1]){
                count++;
            }
        }
        return count;
    }
}