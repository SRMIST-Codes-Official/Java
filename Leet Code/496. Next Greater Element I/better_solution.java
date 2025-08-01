class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] g=new int[nums1.length];
        int a=-1;
        for(int i=0;i<nums1.length;i++){
            int f=-1;
            int ng=-1;
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    f=j;
                    break;
                }
            }
            for(int j=f+1;j<nums2.length;j++){
                if(nums2[j]>nums1[i]){
                   ng=nums2[j];
                   break;
                }
            }
            g[++a]=ng;
        }
        return g;
    }
}