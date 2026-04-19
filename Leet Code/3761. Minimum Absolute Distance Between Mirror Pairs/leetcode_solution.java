class Solution {
    public int minMirrorPairDistance(int[] nums) {
        int dis=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                dis=Math.min(dis,Math.abs(i-map.get(nums[i])));
            }
            map.put(rev(nums[i]),i);
        }
        if(dis==nums.length){
            return -1;
        }
        return dis;
    }
    int rev(int n){
        int num=0;
        while(n>0){
            int d=n%10;
            num=num*10 + d;
            n=n/10;
        }
        return num;
    }
}