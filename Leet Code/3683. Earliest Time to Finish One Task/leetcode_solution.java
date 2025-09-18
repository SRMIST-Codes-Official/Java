class Solution {
    public int earliestTime(int[][] tasks) {
        int s=200;
        for(int i=0;i<tasks.length;i++){
            if(tasks[i][0]+tasks[i][1]<s){
                s=tasks[i][0]+tasks[i][1];
            }
        }
        return s;
    }
}