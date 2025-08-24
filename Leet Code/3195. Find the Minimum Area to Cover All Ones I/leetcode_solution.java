class Solution {
    public int minimumArea(int[][] grid) {
        int minr=grid[0].length;
        int maxr=-1;
        int minc=grid.length;
        int maxc=-1;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]==1){
                    if(i>maxr){
                        maxr=i;
                    }
                    if(i<minr){
                        minr=i;
                    }
                    if(j>maxc){
                        maxc=j;
                    }
                    if(j<minc){
                        minc=j;
                    }
                }
            }
        }
        return(maxr-minr+1)*(maxc-minc+1);
    }
}