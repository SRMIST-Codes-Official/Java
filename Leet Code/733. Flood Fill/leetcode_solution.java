class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int n=image.length;
        int m=image[0].length;
        int[][] vis=new int[n][m];
        int[] delrow={-1,0,1,0};
        int[] delcol={0,1,0,-1};
        dfs(sr,sc,vis,image,image[sr][sc],delrow,delcol);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(vis[i][j]==1){
                    image[i][j]=color;
                }
            }
        }
        return image;
    }
    void dfs(int row, int col,int[][] vis,int[][]image, int node,int[]delrow, int[]delcol){
        vis[row][col]=1;
        int n=image.length;
        int m=image[0].length;
        for(int i=0;i<4;i++){
            int nrow=row+delrow[i];
            int ncol=col+delcol[i];
            if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && vis[nrow][ncol]==0 && image[nrow][ncol]==node){
                dfs(nrow,ncol,vis,image,node, delrow,delcol);
            }
        }
    }
}