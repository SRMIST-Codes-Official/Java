class DisjointSet{
    List<Integer> rank=new ArrayList<>();
    List<Integer> parent=new ArrayList<>();
    public DisjointSet(int n){
        for(int i=0;i<n;i++){
            rank.add(0);
            parent.add(i);
        }
    }
    public int findUPar(int node){
        if(node==parent.get(node)){
            return node;
        }
        int ulp=findUPar(parent.get(node));
        parent.set(node, ulp);
        return parent.get(node);
    }
    void unionByRank(int u, int v){
        int u_ulp=findUPar(u);
        int v_ulp=findUPar(v);
        if(u_ulp==v_ulp){
            return;
        }
        if(rank.get(u_ulp)>rank.get(v_ulp)){
            parent.set(v_ulp, u_ulp);
        }else if(rank.get(v_ulp)>rank.get(u_ulp)){
            parent.set(u_ulp, v_ulp);
        }else{
            parent.set(v_ulp,u_ulp);
            rank.set(u_ulp, rank.get(u_ulp)+1);
        }
    }
}
class Solution {
    public int makeConnected(int n, int[][] connections) {
        DisjointSet ds=new DisjointSet(n);
        int cextra=0;
        for(int i=0;i<connections.length;i++){
            int u=connections[i][0];
            int v=connections[i][1];
            if(ds.findUPar(u)==ds.findUPar(v)){
                cextra++;
            }else{
                ds.unionByRank(u,v);
            }
        }
        int c=0;
        for(int i=0;i<ds.parent.size();i++){
            if(ds.parent.get(i)==i){
                c++;
            }
        }
        if(cextra>=c-1){
            return c-1;
        }
        return -1;
    }
}