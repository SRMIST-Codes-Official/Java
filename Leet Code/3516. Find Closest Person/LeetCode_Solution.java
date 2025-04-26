class Solution {
    public int findClosest(int x, int y, int z) {
        int dx=Math.abs(z-x);
        int dy=Math.abs(z-y);
        if(dx-dy>0){
            return 2;
        }else if(dx-dy==0 ){
            return 0;
        }
        return 1;
    }
}