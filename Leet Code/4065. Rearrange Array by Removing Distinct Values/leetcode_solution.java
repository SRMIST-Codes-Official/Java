class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] fc=new int[101];
        int count=0;
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            fc[nums[i]]++;
        }
        while(count<nums.length){
            for(int i=0;i<fc.length;i++){
            if(fc[i]!=0){
                fc[i]--;
                l.add(i);
                count++;
            }
        }
        }
        int[] res=new int[nums.length];
        int c=0;
        for(int num: l){
            res[c++]=num;
        }
        return res;
    }
}