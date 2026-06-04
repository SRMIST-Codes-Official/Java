class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int tt=999999;
        int lt=999999;
        for(int i=0;i<landDuration.length;i++){
            lt=Math.min(lt, landStartTime[i]+landDuration[i]);
        }
        for(int i=0;i<waterDuration.length;i++){
            tt=Math.min(tt, Math.max(lt,waterStartTime[i])+waterDuration[i]);
        }
        int wt=999999;
        for(int i=0;i<waterDuration.length;i++){
            wt=Math.min(wt,waterStartTime[i]+waterDuration[i]);
        }
        for(int i=0;i<landDuration.length;i++){
            tt=Math.min(tt,Math.max(wt,landStartTime[i])+landDuration[i]);
        }
        return tt;
    }
}