class Solution {
    public int countCompleteComponents(int n, int[][] edges) {
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            adj.get(edges[i][0]).add(edges[i][1]);
            adj.get(edges[i][1]).add(edges[i][0]);
        }
        int[] vis=new int[n];
        int c=0;
        for(int i=0;i<n;i++){
            if(vis[i]==0){
                if(bfs(i, adj,vis)){
                    c++;
                }
            }
        }
        return c;
    }
    boolean bfs(int point, List<List<Integer>>adj,int[] vis){
        Queue<Integer> q=new LinkedList<>();
        q.add(point);
        int nc=0;
        int ec=0;
        vis[point]=1;
        while(!q.isEmpty()){
            int node=q.peek();
            q.remove();
            nc++;
            for(int it:adj.get(node)){
                ec++;
                if(vis[it]==0){
                    q.add(it);
                    vis[it]=1;
                }
            }
        }
        ec=ec/2;
        if((nc*(nc-1)/2) == ec){
            return true;
        }
        return false;
    }
}