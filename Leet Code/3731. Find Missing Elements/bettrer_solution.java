class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        int max=nums[0];
        int min=nums[0];
        for(int i=1;i<nums.length;i++){
            max=Math.max(max, nums[i]);
            min=Math.min(min,nums[i]);
        }
        int[] freq=new int[max-min+1];
        for(int i=0;i<nums.length;i++){
            freq[nums[i]-min]++;
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]==0){
                ans.add(i+min);
            }
        }
        return ans;
    }
}