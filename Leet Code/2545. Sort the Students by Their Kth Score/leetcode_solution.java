class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        int[][] arr=new int[score.length][score[0].length];
        for(int i=0;i<score.length;i++){
            int r=maxs(score, k);
            arr[i]=score[r].clone();
            score[r][k]=-1;
        }
        return arr;
    }
    int maxs(int[][] score, int k){
        int m=-1;
        int row=-1;
        for(int i=0;i<score.length;i++){
            if(score[i][k]>m){
                m=score[i][k];
                row=i;
            }
        }
        return row;
    }
}