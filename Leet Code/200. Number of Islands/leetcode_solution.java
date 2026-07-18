class Pair{
    int first;
    int second;
    Pair(int first, int second){
        this.first=first;
        this.second=second;
    }
}
class Solution {
    public int numIslands(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int[][] vis=new int[n][m];
        int c=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='1' && vis[i][j]==0){
                    c++;
                    bfs(grid, i,j,vis);
                }
            }
        }
        return c;
    }
    void bfs(char[][] grid, int ro, int co, int[][] vis){
        int n=grid.length;
        int m=grid[0].length;
        vis[ro][co]=1;
        Queue<Pair> q=new LinkedList<>();
        q.offer(new Pair(ro,co));
        while(!q.isEmpty()){
            int row=q.peek().first;
            int col=q.peek().second;
            q.poll();
            if((row-1>=0 && row-1<n) && (col>=0 &&col<m) && grid[row-1][col]=='1' && vis[row-1][col]==0){
                q.offer(new Pair(row-1,col));
                vis[row-1][col]=1;
            }
            if((row+1>=0 && row+1<n) && (col>=0 &&col<m) && grid[row+1][col]=='1' && vis[row+1][col]==0){
                q.offer(new Pair(row+1,col));
                vis[row+1][col]=1;
            }
            if((row>=0 && row<n) && (col-1>=0 &&col-1<m) && grid[row][col-1]=='1' && vis[row][col-1]==0){
                q.offer(new Pair(row,col-1));
                vis[row][col-1]=1;
            }
            if((row>=0 && row<n) && (col+1>=0 &&col+1<m) && grid[row][col+1]=='1' && vis[row][col+1]==0){
                q.offer(new Pair(row,col+1));
                vis[row][col+1]=1;
            }
        }
    }
}