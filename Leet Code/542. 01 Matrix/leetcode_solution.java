class Pair{
    int first;
    int second;
    int dist;
    Pair(int first, int second, int dist){
        this.first=first;
        this.second=second;
        this.dist=dist;
    }
}
class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int[] delrow={-1,0,1,0};
        int[] delcol={0,1,0,-1};
        int n=mat.length;
        int m=mat[0].length;
        int[][] vis=new int[n][m];
        int[][] res=new int[n][m];
        Queue<Pair> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==0){
                    q.add(new Pair(i,j,0));
                    vis[i][j]=1;
                }
            }
        }
        while(!q.isEmpty()){
            int row=q.peek().first;
            int col=q.peek().second;
            int d=q.peek().dist;
            q.remove();
            res[row][col]=d;
            for(int i=0;i<4;i++){
                int nrow=row+delrow[i];
                int ncol=col+delcol[i];
                if(nrow>=0 && nrow<n && ncol>=0 &&ncol<m && vis[nrow][ncol]==0){
                    q.add(new Pair(nrow,ncol,d+1));
                    vis[nrow][ncol]=1;
                }
            }
        }
        return res;

    }
}