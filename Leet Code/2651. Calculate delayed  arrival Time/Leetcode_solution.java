class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        int t=arrivalTime+delayedTime;
        while(t>=24){
            t=t-24;
        }
        return t;
    }
}