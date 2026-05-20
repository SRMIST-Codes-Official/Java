class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s=new HashSet<>();
        for(int n:nums2){
            s.add(n);
        }
        Set<Integer> r=new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            if(s.contains(nums1[i])){
                r.add(nums1[i]);
            }
        }
        int[] arr=new int[r.size()];
        int i=0;
        for(int n: r){
            arr[i++]=n;
        }
        return arr;
    }
}