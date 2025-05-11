class Solution {
    public long minSum(int[] nums1, int[] nums2) {
        int c1 = 0;
        int c2 = 0;
        long s1 = 0;
        long s2 = 0;
        for(int i=0;i<nums1.length;i++){
            if(nums1[i]==0){
                c1++;
            }
            s1=s1+nums1[i];
        }
        for(int i=0;i<nums2.length;i++){
            if(nums2[i]==0){
                c2++;
            }
            s2=s2+nums2[i];
        }
        if (c1 == c2 && c2 == 0) {
            if (s1 == s2) {
                return s1;
            } else {
                return -1;
            }
        } else if (c1 > 0 && c2 > 0) {
            return Math.max(s1 + c1, s2 + c2);
        } else if (c1 > 0 && c2 == 0)
        {
            if (s1 + c1 <= s2) {
                return s2;
            }
        } else if (c2 > 0 && c1 == 0) {
            if (s2 + c2 <= s1) {
                return s1;
            }
        }
        return -1;
    }
}