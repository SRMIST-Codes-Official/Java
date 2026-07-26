class Node{
    int first;
    int second;
    int d;
    Node(int first, int second, int d){
        this.first=first;
        this.second=second;
        this.d=d;
    }
}
class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n=grid.length;
        if(grid[0][0]==1 || grid[n-1][n-1]==1){
            return -1;
        }
        Queue<Node> q= new LinkedList<>();
        q.add(new Node(0,0,1));
        int[][] dist=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                dist[i][j]=(int)1e9;
            }
        }
        dist[0][0]=1;
        while(!q.isEmpty()){
            int row=q.peek().first;
            int col=q.peek().second;
            int dis=q.peek().d;
            q.remove();
            if(row==n-1 && col==n-1){
                return dis;
            }
            for(int i=-1;i<=1;i++){
                for(int j=-1;j<=1;j++){
                    int nr=row+i;
                    int nc=col+j;
                    if(nr>=0 && nr<n && nc>=0 && nc<n && grid[nr][nc]==0 && dis+1<dist[nr][nc]){
                        q.add(new Node(nr,nc, dis+1));
                        dist[nr][nc]=dis+1;
                    }
                }
            }
        }
        return -1;
    }
}