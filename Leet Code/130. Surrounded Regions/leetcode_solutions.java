class Solution {
    public void solve(char[][] board) {
        int n=board.length;
        int m=board[0].length;
        int[][] vis=new int[n][m];
        for(int i=0;i<m;i++){
            if(board[0][i]=='O'){
                dfs(0,i,board,vis);
            }
            if(board[n-1][i]=='O'){
                dfs(n-1,i,board,vis);
            }
        }
        for(int i=0;i<n;i++){
            if(board[i][0]=='O'){
                dfs(i,0,board,vis);
            }
            if(board[i][m-1]=='O'){
                dfs(i,m-1,board,vis);
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(vis[i][j]!=1){
                    board[i][j]='X';
                }
            }
        }
    }
    void dfs(int row, int col, char[][] board, int[][]vis){
        vis[row][col]=1;
        int n=board.length;
        int m=board[0].length;
        int[] delrow={-1,0,1,0};
        int[] delcol={0,-1,0,1};
        for(int i=0;i<4;i++){
            int nrow=row+delrow[i];
            int ncol=col+delcol[i];
            if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && board[nrow][ncol]=='O' && vis[nrow][ncol]!=1){
                dfs(nrow,ncol,board,vis);
            }
        }
    }
}