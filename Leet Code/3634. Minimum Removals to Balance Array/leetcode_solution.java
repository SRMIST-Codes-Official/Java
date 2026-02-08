class Solution {
    public int minRemoval(int[] nums, int k) {
        Arrays.sort(nums);
        int c=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums.length - i - 1 <c){
                    break;
                }
                if(((long)nums[i]*k)>=(long)nums[j]){
                    c=Math.max(c,(j-i));
                }else{
                    break;
                }
            }
        }
        return nums.length-c-1;
    }
}