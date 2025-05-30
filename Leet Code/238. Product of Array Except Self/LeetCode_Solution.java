class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] a= new int[nums.length];
        int n=nums.length;
        a[0]=1;
        for(int i=1;i<n;i++){
            a[i]=a[i-1]*nums[i-1];
        }
        int s=1;
        for(int i=n-1;i>=0;i--){
            a[i]=a[i]*s;
            s=s*nums[i];
        }
        return a;
    }
}