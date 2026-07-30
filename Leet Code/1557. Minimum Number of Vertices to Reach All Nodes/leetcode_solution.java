class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        int[] incoming=new int[n];
        for(int i=0;i<edges.size();i++){
            incoming[edges.get(i).get(1)]++;
        }
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(incoming[i]==0){
                l.add(i);
            }
        }
        return l;
    }
}