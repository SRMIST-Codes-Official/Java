class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n=graph.length;
        int[] vis=new int[n];
        int[] pathvis=new int[n];
        int[] safe=new int[n];
        for(int i=0;i<n;i++){
            if(vis[i]==0){
                dfs(i, graph, vis, pathvis, safe);
            }
        }
        List<Integer> res=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(safe[i]==1){
                res.add(i);
            }
        }
        return res;
    }
    boolean dfs(int node, int[][] graph, int[]vis, int[] pathvis, int[] safe){
        vis[node]=1;
        pathvis[node]=1;
        safe[node]=0;
        for(int i=0;i<graph[node].length;i++){
            if(vis[graph[node][i]]==0){
                if(dfs(graph[node][i],graph,vis,pathvis,safe)==true){
                    return true;
                }
            }
            else if(pathvis[graph[node][i]]==1){
                return true;
            }
        }
        pathvis[node]=0;
        safe[node]=1;
        return false;
    }
}