class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> l=new ArrayList<>();
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
        int n=nums.length/3;
        for(int key: map.keySet()){
            if(map.get(key)>n){
                l.add(key);
            }
        }
        return l;
    }
}