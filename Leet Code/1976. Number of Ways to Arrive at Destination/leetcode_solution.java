class Pair{
    long first;
    int second;
    Pair(long first, int second){
        this.first=first;
        this.second=second;
    }
}
class Solution {
    public int countPaths(int n, int[][] roads) {
        ArrayList<ArrayList<Pair>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<roads.length;i++){
            adj.get(roads[i][0]).add(new Pair(roads[i][2], roads[i][1]));
            adj.get(roads[i][1]).add(new Pair(roads[i][2], roads[i][0]));
        }
        long[] dist=new long[n];
        for(int i=0;i<n;i++){
            dist[i]=Long.MAX_VALUE;
        }
        int[] ways=new int[n];
        dist[0]=0;
        ways[0]=1;
        PriorityQueue<Pair>pq=new PriorityQueue<>((a, b) -> Long.compare(a.first, b.first));
        pq.add(new Pair(0,0));
        int mod=(int)(1e9 + 7);
        while(!pq.isEmpty()){
            int node=pq.peek().second;
            long dis=pq.peek().first;
            pq.remove();
            for(Pair it: adj.get(node)){
                int adjNode=it.second;
                long edw=it.first;
                if(dis+edw<dist[adjNode]){
                    dist[adjNode]=dis+edw;
                    pq.add(new Pair(dis+edw, adjNode));
                    ways[adjNode]=ways[node];
                }
                else if(dis+edw==dist[adjNode]){
                    ways[adjNode]=(ways[adjNode]+ways[node]) %mod;
                }
            }

        }
        return ways[n-1]%mod;
    }
}