class Solution {
    public List<Integer> findValidElements(int[] nums) {
        List<Integer> l=new ArrayList<>();
        int[] n=new int[nums.length];
        int m=0;
        for(int i=nums.length-2;i>=0;i--){
            m=Math.max(nums[i+1],m);
            n[i]=m;
        }
        l.add(nums[0]);
        m=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>n[i] || nums[i]>m){
                l.add(nums[i]);
            }
            m=Math.max(nums[i],m);
        }
        return l;
    }
}