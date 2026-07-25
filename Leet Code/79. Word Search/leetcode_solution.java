class Solution {
    public boolean exist(char[][] board, String word) {
        int[] delcol={-1,0,1,0};
        int[] delrow={0,-1,0,1};
        int n=board.length;
        int m=board[0].length;
        int[][] vis=new int[n][m];
        char s=word.charAt(0);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(s==board[i][j]){
                    if(dfs(i,j,board,word,delrow,delcol,0,vis)==true){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    boolean dfs(int row,int col, char[][]board, String word, int[] delrow, int[] delcol, int pos,int[][] vis){
        if(pos+1==word.length()){
            return true;
        }
        vis[row][col]=1;
        char next=word.charAt(pos+1);
        int n=board.length;
        int m=board[0].length;
        for(int i=0;i<4;i++){
            int nrow=row+delrow[i];
            int ncol=col+delcol[i];
            if((nrow>=0 && nrow<n) &&(ncol>=0 && ncol<m) && vis[nrow][ncol]==0 && board[nrow][ncol]==next){
                if(dfs(nrow, ncol, board, word, delrow, delcol,pos+1,vis)==true){
                    return true;
                }
            }
        }
        vis[row][col]=0;
        return false;
    }
}