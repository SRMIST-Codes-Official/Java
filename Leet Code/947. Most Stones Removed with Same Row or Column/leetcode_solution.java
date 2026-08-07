class DisjointSet{
    List<Integer> parent=new ArrayList<>();
    List<Integer> size=new ArrayList<>();
    public DisjointSet(int n){
        for(int i=0;i<=n;i++){
            parent.add(i);
            size.add(1);
        }
    }
    public int findUPar(int node){
        if(parent.get(node)==node){
            return node;
        }
        int ulp=findUPar(parent.get(node));
        parent.set(node, ulp);
        return ulp;
    }
    public void unionBySize(int u, int v){
        int u_ulp=findUPar(u);
        int v_ulp=findUPar(v);
        if(u_ulp == v_ulp){
            return;
        }
        if(size.get(u_ulp)>size.get(v_ulp)){
            parent.set(v_ulp, u_ulp);
            size.set(u_ulp, size.get(u_ulp)+size.get(v_ulp));
        }else{
            parent.set(u_ulp, v_ulp);
            size.set(v_ulp, size.get(u_ulp)+size.get(v_ulp));
        }
    }
}
class Solution {
    public int removeStones(int[][] stones) {
        int maxRows=0;
        int maxCols=0;
        for(int i=0;i<stones.length;i++){
            maxRows=Math.max(maxRows, stones[i][0]);
            maxCols=Math.max(maxCols, stones[i][1]);
        }
        DisjointSet ds=new DisjointSet(maxRows+maxCols+1);
        HashMap<Integer,Integer> stoneNode=new HashMap<>();
        for(int i=0;i<stones.length;i++){
            int noderow=stones[i][0];
            int nodecol=stones[i][1]+maxRows+1;
            ds.unionBySize(noderow, nodecol);
            stoneNode.put(noderow,1);
            stoneNode.put(nodecol,1);
        }
        int c=0;
        for(Map.Entry<Integer, Integer> i:stoneNode.entrySet()){
            if(ds.findUPar(i.getKey())==i.getKey()){
                c++;
            }
        }
        return stones.length-c;
    }
}