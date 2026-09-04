class Solution {
    public boolean uniformArray(int[] nums1) {
        int s=Integer.MAX_VALUE;
        boolean o=false;
        for(int i=0;i<nums1.length;i++){
            if(s>nums1[i]){
                s=nums1[i];
            }
            if(nums1[i]%2!=0){
                o=true;
            }
        }
        if(s%2==0 && o==true){
            return false;
        }
        return true;
    }
}