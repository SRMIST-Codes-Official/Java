class Node{
    int effort;
    int first;
    int second;
    Node(int effort, int first, int second){
        this.effort=effort;
        this.first=first;
        this.second=second;
    }
}
class Solution {
    public int minimumEffortPath(int[][] heights) {
        PriorityQueue<Node> pq=new PriorityQueue<>((x,y)->x.effort-y.effort);
        int n=heights.length;
        int m=heights[0].length;
        int[][] dist=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                dist[i][j]=(int)1e9;
            }
        }
        dist[0][0]=0;
        pq.add(new Node(0,0,0));
        int[] dr={-1,0,1,0};
        int[] dc={0,-1,0,1};
        while(!pq.isEmpty()){
            int row=pq.peek().first;
            int col=pq.peek().second;
            int dis=pq.peek().effort;
            pq.remove();
            if(row==n-1 && col==m-1){
                return dis;
            }
            for(int i=0;i<4;i++){
                int nr=row+dr[i];
                int nc=col+dc[i];
                if(nr>=0 && nr<n && nc>=0 && nc<m && Math.max(dis,Math.abs(heights[nr][nc]-heights[row][col]))<dist[nr][nc]){
                    dist[nr][nc]=Math.max(dis,Math.abs(heights[nr][nc]-heights[row][col]));
                    pq.add(new Node(dist[nr][nc], nr, nc));
                }
            }
        }
        return -1;
    }
}