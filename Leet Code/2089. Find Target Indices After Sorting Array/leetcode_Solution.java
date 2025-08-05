class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> t=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                t.add(i);
            }
            if(nums[i]>target){
                break;
            }
        }
        return t;
    }
}