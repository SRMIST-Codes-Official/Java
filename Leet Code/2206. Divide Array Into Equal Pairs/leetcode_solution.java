class Solution {
    public boolean divideArray(int[] nums) {
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer, Integer> e:map.entrySet()){
            if(e.getValue()%2==1){
                return false;
            }
        }
        return true;
    }
}