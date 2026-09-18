class Solution {
    public int[][] cyclicShift(int n, int[][] grid, int[] rowShift, int[] colShift) {
        for(int i=0;i<n;i++){
            int s=rowShift[i];
            for(int j=0;j<s;j++){
                int l=grid[i][0];
                for(int k=0;k<n-1;k++){
                    grid[i][k]=grid[i][k+1];
                }
                grid[i][n-1]=l;
            }
        }
        for(int i=0;i<n;i++){
            int s=colShift[i];
            for(int j=0;j<s;j++){
                int l=grid[0][i];
                for(int  k=0;k<n-1;k++){
                    grid[k][i]=grid[k+1][i];
                }
                grid[n-1][i]=l;
            }
        }
        return grid;
    }
}