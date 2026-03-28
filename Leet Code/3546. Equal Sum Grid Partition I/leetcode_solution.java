class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        long[] rsum=new long[grid.length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                rsum[i]+=grid[i][j];
            }
        }
        long[] csum=new long[grid[0].length];
        for(int i=0;i<grid[0].length;i++){
            for(int j=0;j<grid.length;j++){
                csum[i]+=grid[j][i];
            }
        }
        long sum1=0;
        long sum2=0;
        for(int i=0;i<rsum.length;i++){
            sum2+=rsum[i];
        }
        for(int i=0;i<rsum.length-1;i++){
            sum1+=rsum[i];
            sum2=sum2-rsum[i];
            if(sum1==sum2){
                return true;
            }
        }
        sum1=0;
        sum2=0;
        for(int i=0;i<csum.length;i++){
            sum2+=csum[i];
        }
        for(int i=0;i<csum.length-1;i++){
            sum1+=csum[i];
            sum2=sum2-csum[i];
            if(sum1==sum2){
                return true;
            }
        }
        return false;
    }
}