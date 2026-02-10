class Solution {
    public List<Long> mergeAdjacent(int[] nums) {
        List<Long> l=new ArrayList<>();
        for(long num: nums){
            while(!l.isEmpty() && l.get(l.size()-1) == num){
                num+=l.remove(l.size()-1);
            }
            l.add(num);
        }
        return l;
    }
}