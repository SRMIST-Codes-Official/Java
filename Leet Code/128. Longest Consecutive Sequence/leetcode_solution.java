class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        Set<Integer> set=new TreeSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        List<Integer> list=new ArrayList<>(set);
        int c=0;
        int count=1;
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i)+1!=list.get(i+1)){
                c=Math.max(c,count);
                count=1;
            }else{
                count++;
            }
        }
        c=Math.max(c,count);
        return c;
    }
}