class Solution {
    public int minimumDistance(int[] nums) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])){
                map.get(nums[i]).add(i);
            }else{
                List<Integer>  list=new ArrayList<>();
                list.add(i);
                map.put(nums[i],list);
            }
        }
        int res=10000000;
        for(List<Integer> list:map.values()){
            if(list.size()<3){
                continue;
            }
            for(int i=0;i<=list.size()-3;i++){
                int val=Math.abs(list.get(i)-list.get(i+1))+Math.abs(list.get(i+1)-list.get(i+2))+Math.abs(list.get(i)-list.get(i+2));
                if(val<res){
                    res=val;
                }
            }
        }
        if(res==10000000){
            return -1;
        }
        return res;

    }
}