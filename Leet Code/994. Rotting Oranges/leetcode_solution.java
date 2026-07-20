class Node{
    int first;
    int second;
    int time;
    Node(int first, int second, int time){
        this.first=first;
        this.second=second;
        this.time=time;
    }
}
class Solution {
    public int orangesRotting(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int[] delrow={-1,0,1,0};
        int[] delcol={0,1,0,-1};
        Queue<Node> q=new LinkedList<>();
        int fc=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    fc++;
                }else if(grid[i][j]==2){
                    q.add(new Node(i,j,0));
                }
            }
        }
        int res=0;
        while(!q.isEmpty()){
            int row=q.peek().first;
            int col=q.peek().second;
            int t=q.peek().time;
            q.remove();
            for(int i=0;i<4;i++){
                int nrow=row+delrow[i];
                int ncol=col+delcol[i];
                if(nrow>=0 &&nrow<n && ncol>=0 &&ncol<m && grid[nrow][ncol]==1){
                    q.add(new Node(nrow,ncol,t+1));
                    grid[nrow][ncol]=2;
                    res=Math.max(res,t+1);
                    fc--;
                }
            }
        }
        if(fc==0){
            return res;
        }
        return -1;
    }
}