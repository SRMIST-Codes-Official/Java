class DisjointSet{
    List<Integer> parent=new ArrayList<>();
    List<Integer> rank=new ArrayList<>();
    public DisjointSet(int n){
        for(int i=0;i<n;i++){
            parent.add(i);
            rank.add(0);
        }
    }
    public int findUPar(int node){
        if(parent.get(node)==node){
            return node;
        }
        int ulp=findUPar(parent.get(node));
        parent.set(node, ulp);
        return parent.get(node);
    }
    public void unionByRank(int u, int v){
        int u_ulp=findUPar(u);
        int v_ulp=findUPar(v);
        if(u_ulp==v_ulp){
            return;
        }
        if(rank.get(u_ulp)>rank.get(u_ulp)){
            parent.set(v_ulp, u_ulp);
        }else if(rank.get(v_ulp)>rank.get(u_ulp)){
            parent.set(u_ulp, v_ulp);
        }else{
            parent.set(v_ulp, u_ulp);
            rank.set(u_ulp, rank.get(u_ulp)+1);
        }
    }
}
class Solution {
    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        int n=accounts.size();
        DisjointSet ds=new DisjointSet(n);
        HashMap<String, Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            for(int j=1;j<accounts.get(i).size();j++){
                String mail=accounts.get(i).get(j);
                if(!map.containsKey(mail)){
                    map.put(mail,i);
                }else{
                    ds.unionByRank(i, map.get(mail));
                }
            }
        }
        ArrayList<String>[] mergedmail=new ArrayList[n];
        for(int i=0;i<n;i++){
            mergedmail[i]=new ArrayList<String>();
        }
        for(Map.Entry<String,Integer> e:map.entrySet()){
            String mail=e.getKey();
            int node=ds.findUPar(e.getValue());
            mergedmail[node].add(mail);
        }
        List<List<String>> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(mergedmail[i].size()==0){
                continue;
            }
            Collections.sort(mergedmail[i]);
            List<String> temp=new ArrayList<>();
            temp.add(accounts.get(i).get(0));
            for(int j=0;j<mergedmail[i].size();j++){
                temp.add(mergedmail[i].get(j));
            }
            ans.add(temp);
        }
        return ans;
    }
}