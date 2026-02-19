class Solution {
    public int firstUniqueFreq(int[] nums) {
        HashMap<Integer, Integer> freq=new HashMap<>();
        HashMap<Integer, Integer> freqcount=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            freq.put(nums[i], freq.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer, Integer> e: freq.entrySet()){
            freqcount.put(e.getValue(), freqcount.getOrDefault(e.getValue(),0)+1);
        }
        for(int i=0;i<nums.length;i++){
            if(freqcount.get(freq.get(nums[i]))==1){
                return nums[i];
            }
        }
        return -1;
    }
}