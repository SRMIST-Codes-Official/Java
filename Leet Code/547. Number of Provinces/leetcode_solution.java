class Solution {
    public int findCircleNum(int[][] isConnected) {
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<=isConnected.length;i++){
            adj.add(new ArrayList<Integer>());
        }
        for(int i=0;i<isConnected.length;i++){
            for(int j=0;j<isConnected[0].length;j++){
                if(isConnected[i][j]==1 && i!=j){
                    adj.get(i).add(j);
                }
            }
        }
        int[] vis=new int[isConnected.length];
        int c=0;
        for(int i=0;i<vis.length;i++){
            if(vis[i]==0){
                c++;
                vis[i]=1;
                bfs(i,adj,vis);
            }
        }
        return c;
    }
    void bfs(int pos, List<List<Integer>> adj,int[] vis){
        Queue<Integer> q=new LinkedList<>();
        q.offer(pos);
        while(!q.isEmpty()){
            int n=q.poll();
            for(int i:adj.get(n)){
                if(vis[i]==0){
                    vis[i]=1;
                    q.offer(i);
                }
            }
        }
    }
}