class Solution {
    public int trap(int[] height) {
        int l=0;
        int r=height.length-1;
        int c=0;
        int leftmax=0;
        int rightmax=0;
        while(l<=r){
            if(height[l]<=height[r]){
                if(height[l]>=leftmax){
                    leftmax=height[l];
                }else{
                    c+=leftmax-height[l];
                }
                l++;
            }else{
                if(height[r]>=rightmax){
                    rightmax=height[r];
                }else{
                    c+=rightmax-height[r];
                }
                r--;
            }
        }
        return c;
    }
}