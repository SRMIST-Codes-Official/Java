class Node{
    int first;
    int second;
    int dis;
    Node(int first, int second, int dis){
        this.first=first;
        this.second=second;
        this.dis=dis;
    }
}
class Solution {
    public int minPathSum(int[][] grid) {
        PriorityQueue<Node> q=new PriorityQueue<Node>((x,y) -> x.dis-y.dis);
        q.add(new Node(0,0,grid[0][0]));
        int n=grid.length;
        int m=grid[0].length;
        int[][] dis=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                dis[i][j]=(int)1e9;
            }
        }
        dis[0][0]=grid[0][0];
        int ans=(int)1e9;
        while(!q.isEmpty()){
            int row=q.peek().first;
            int col=q.peek().second;
            int d=q.peek().dis;
            q.remove();
            if(row==n-1 && col==m-1){
                return d;
            }
            if(col+1<m && d+grid[row][col+1]<dis[row][col+1]){
                dis[row][col+1]=d+grid[row][col+1];
                q.add(new Node(row, col+1, d+grid[row][col+1]));
            }
            if(row+1<n && d+grid[row+1][col]<dis[row+1][col]){
                dis[row+1][col]=d+grid[row+1][col];
                q.add(new Node(row+1,col,d+grid[row+1][col]));
            }
        }
        return ans;
    }
}