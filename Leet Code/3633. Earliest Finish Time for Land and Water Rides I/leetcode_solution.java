class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int tt=9999;
        for(int i=0;i<landStartTime.length;i++){
            int lt=9999;
            lt=Math.min(lt, landStartTime[i]+landDuration[i]);
            for(int j=0;j<waterStartTime.length;j++){
                if(lt<waterStartTime[j]){
                    tt=Math.min(tt, waterStartTime[j]+waterDuration[j]);
                }else{
                    tt=Math.min(tt, lt+waterDuration[j]);
                }
            }
        }
        for(int i=0;i<waterStartTime.length;i++){
            int wt=9999;
            wt=Math.min(wt, waterStartTime[i]+waterDuration[i]);
            for(int j=0;j<landStartTime.length;j++){
                if(wt<landStartTime[j]){
                    tt=Math.min(tt, landStartTime[j]+landDuration[j]);
                }else{
                    tt=Math.min(tt, wt+landDuration[j]);
                }
            }
        }
        return tt;
    }
}