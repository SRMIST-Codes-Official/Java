class Solution {
    public boolean isBipartite(int[][] graph) {
        int n=graph.length;
        int[] col=new int[n];
        for(int i=0;i<n;i++){
            col[i]=-1;
        }
        for(int i=0;i<n;i++){
            if(col[i]==-1){
                if(check(i,graph,col)==false){
                    return false;
                }
            }
        }
        return true;
    }
    boolean check(int node, int[][] graph, int[]col){
        Queue<Integer> q=new LinkedList<>();
        q.add(node);
        col[node]=0;
        while(!q.isEmpty()){
            int n=q.peek();
            q.remove();
            for(int i=0;i<graph[n].length;i++){
                if(col[graph[n][i]]==-1){
                    col[graph[n][i]]=1-col[n];
                    q.add(graph[n][i]);
                }else if(col[graph[n][i]]==col[n]){
                    return false;
                }
            }
        }
        return true;
    }
}