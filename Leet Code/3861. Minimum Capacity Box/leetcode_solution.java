class Solution {
    public int minimumIndex(int[] capacity, int itemSize) {
        int index=-1;
        int cap=101;
        for(int i=0;i<capacity.length;i++){
            if(capacity[i]>=itemSize && capacity[i]<cap){
                cap=capacity[i];
                index=i;
            }
        }
        return index;
    }
}