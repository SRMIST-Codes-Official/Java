class Solution {
    public int largestAltitude(int[] gain) {
        int h=0;
        int max=0;
        for(int i=0;i<gain.length;i++){
            h=h+gain[i];
            if(h>max){
                max=h;
            }
        }
        return max;
    }
}