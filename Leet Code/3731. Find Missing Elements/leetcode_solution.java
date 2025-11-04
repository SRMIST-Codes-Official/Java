class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> l = new ArrayList<>();
        int min=101;
        int max=0;
        for(int i=0;i<nums.length;i++){
            min=Math.min(min,nums[i]);
            max=Math.max(max,nums[i]);
        }
        for(int i=min;i<=max;i++){
            int c=1;
            for(int j=0;j<nums.length;j++){
                if(nums[j]==i){
                    c=0;
                    break;
                }
            }
            if(c==1){
                l.add(i);
            }
        }
        return l;

    }
}