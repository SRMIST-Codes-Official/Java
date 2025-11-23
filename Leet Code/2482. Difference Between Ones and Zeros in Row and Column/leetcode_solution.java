class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int[][] diff=new int[grid.length][grid[0].length];
        int[] rowsum=new int[grid.length];
        int[] colsum=new int[grid[0].length];
        for(int i=0;i<rowsum.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==0){
                    rowsum[i]--;
                }else{
                    rowsum[i]++;
                }
            }
        }
        for(int i=0;i<colsum.length;i++){
            for(int j=0;j<grid.length;j++){
                if(grid[j][i]==0){
                    colsum[i]--;
                }else{
                    colsum[i]++;
                }
            }
        }
        for(int i=0;i<diff.length;i++){
            for(int j=0;j<diff[0].length;j++){
                diff[i][j]=rowsum[i]+colsum[j];
            }
        }
        return diff;
    }
    
}