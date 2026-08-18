class Solution {
    public int largestInteger(int[] nums, int k) {
        int max=0;
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            max=Math.max(max, nums[i]);
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        if(k==1){
            int res=-1;
            for(Map.Entry<Integer, Integer> entry : map.entrySet()){
                int temp=entry.getValue();
                if(temp==1){
                    res=Math.max(res, entry.getKey());
                }
            }
            return res;
        }else if(k==nums.length){
            return max;
        }else{
            int nmax=-1;
            if(map.get(nums[0])==1){
                nmax=nums[0];
            }
            if(map.get(nums[nums.length-1])==1){
                nmax=Math.max(nmax, nums[nums.length-1]);
            }
            return nmax;
        }

    }
}