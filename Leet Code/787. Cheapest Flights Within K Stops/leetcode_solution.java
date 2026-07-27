class Pair{
    int first;
    int second;
    Pair(int first, int second){
        this.first=first;
        this.second=second;
    }
}
class Tuple{
    int first;
    int second;
    int third;
    Tuple(int first, int second, int third){
        this.first=first;
        this.second=second;
        this.third=third;
    }
}
class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        List<List<Pair>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<flights.length;i++){
            adj.get(flights[i][0]).add(new Pair(flights[i][1], flights[i][2]));
        }
        Queue<Tuple> pq=new LinkedList<>();
        int[] dist=new int[n];
        pq.add(new Tuple(0, src, 0));
        for(int i=0;i<n;i++){
            dist[i]=(int)1e9;
        }
        dist[src]=0;
        while(!pq.isEmpty()){
            int node=pq.peek().second;
            int stops=pq.peek().first;
            int cost=pq.peek().third;
            pq.remove();
            if(stops>k){
                continue;
            }
            for(Pair it: adj.get(node)){
                int dest=it.first;
                int currentcost=it.second;
                if(cost+currentcost<dist[dest]){
                    dist[dest]=cost+currentcost;
                    pq.add(new Tuple(stops+1, dest, dist[dest]));
                }
            }
        }
        if(dist[dst]==(int)1e9){
            return -1;
        }
        return dist[dst];
    }
}