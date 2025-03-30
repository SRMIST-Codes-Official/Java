class Solution {
    public int maxFrequencyElements(int[] nums) {
        int freq=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            int c=1;
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    c++;
                }
            }
            if(c==count){
                freq=freq+c;
            }
            else if(c>count){
                freq=c;
                count=c;
            }
        }
        return freq;
    }
}