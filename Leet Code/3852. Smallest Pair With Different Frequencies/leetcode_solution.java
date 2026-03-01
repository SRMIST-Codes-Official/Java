class Solution {
    public int[] minDistinctFreqPair(int[] nums) {
        HashMap<Integer, Integer> map=new HashMap<>();
        int min=101;
        for(int i=0;i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
            if(nums[i]<min){
                min=nums[i];
            }
        }
        int freq=map.get(min);
        int el=101;
        for(Map.Entry<Integer,Integer>e: map.entrySet()){
            if(e.getKey()==min){
                continue;
            }
            if(e.getValue()!=freq && e.getKey()<el){
                el=e.getKey();
            }
        }
        int[] arr=new int[2];
        arr[0]=min;
        arr[1]=el;
        if(arr[1]==101){
            arr[0]=-1;
            arr[1]=-1;
        }
        return arr;
    }
}