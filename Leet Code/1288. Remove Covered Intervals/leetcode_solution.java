class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        int c=0;
        for(int i=0;i<intervals.length;i++){
            if(intervals[i][0]==-1){
                continue;
            }
            for(int j=0;j<intervals.length;j++){
                if(intervals[j][0]==-1 || j==i){
                    continue;
                }
                if(intervals[j][0]>=intervals[i][0] && intervals[j][1]<=intervals[i][1]){
                    c++;
                    intervals[j][0]=-1;
                }
            }
        }
        return intervals.length-c;
    }
}