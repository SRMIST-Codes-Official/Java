class Solution {
    public int missingInteger(int[] nums) {
        int sum=nums[0];
        Set<Integer> s=new HashSet<>();
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]+1==nums[i]){
                sum+=nums[i];
            }else{
                break;
            }
        }
        for(int i=0;i<nums.length;i++){
            s.add(nums[i]);
        }
        while(s.contains(sum)){
            sum++;
        }
        return sum;

    }
}