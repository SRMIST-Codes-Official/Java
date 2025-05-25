class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int n1=0, n2=0;
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    n1++;
                    break;
                }
            }
        }
        for(int i=0;i<nums2.length;i++){
            for(int j=0;j<nums1.length;j++){
                if(nums2[i]==nums1[j]){
                    n2++;
                    break;
                }
            }
        }
        int[] n={n1,n2};
        return n;
    }
}