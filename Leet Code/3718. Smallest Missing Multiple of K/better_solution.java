class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> s=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]%k==0){
                s.add(nums[i]);
            }
        }
        int c=k;
        while(true){
            if(s.contains(k)){
                k=k+c;
                continue;
            }else{
                return k;
            }
        }
    }
}