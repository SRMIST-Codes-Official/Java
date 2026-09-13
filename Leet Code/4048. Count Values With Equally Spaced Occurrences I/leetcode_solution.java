class Solution {
    public int countSpecialIntegers(int[] nums) {
        HashMap<Integer, List<Integer>> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.get(nums[i]).add(i);
            }else{
                List<Integer> l=new ArrayList<>();
                l.add(i);
                map.put(nums[i],l);
            }
        }
        int c=0;
        for(Map.Entry<Integer, List<Integer>> e:map.entrySet()){
            if(e.getValue().size()!=3){
                continue;
            }else{
                if(e.getValue().get(1)-e.getValue().get(0) == e.getValue().get(2)-e.getValue().get(1)){
                    c++;
                }
            }
        }
        return c;
    }
}