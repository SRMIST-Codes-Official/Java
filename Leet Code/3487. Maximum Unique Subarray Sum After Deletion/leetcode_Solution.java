class Solution {
    public int maxSum(int[] nums) {
        List<Integer> l=new ArrayList<>();
        int s=0;
        int min=-999999;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=0 && min<nums[i]){
                min=nums[i];
            }
            if(nums[i]>0 && !l.contains(nums[i])){
                s+=nums[i];
                l.add(nums[i]);
            }
        }
        if(s==0){
            return min;
        }
        return s;
    }
}