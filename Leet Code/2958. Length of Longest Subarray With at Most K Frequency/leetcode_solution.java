class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer, Integer> map=new HashMap<>();
        int j=0;
        int i=0;
        int max=0;
        while(j<nums.length){
            if(!map.containsKey(nums[j])){
                map.put(nums[j],1);
            }else{
                int freq=map.get(nums[j]);
                if(freq==k){
                    while(nums[i]!=nums[j]){
                        map.put(nums[i],map.get(nums[i])-1);
                        i++;
                    }
                    i++;
                }else{
                    map.put(nums[j],freq+1);
                }
            }
            j++;
            max=Math.max(max, j-i);
        }
        return max;
    }
}