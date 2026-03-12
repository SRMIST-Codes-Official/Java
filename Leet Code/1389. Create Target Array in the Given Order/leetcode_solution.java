class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            l.add(index[i],nums[i]);
        }
        int[] arr=new int[l.size()];
        int i=0;
        for(int x:l){
            arr[i++]=x;
        }
        return arr;
    }
}