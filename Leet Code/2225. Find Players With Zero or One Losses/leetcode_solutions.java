class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int i=0;i<matches.length;i++){
            map.put(matches[i][1], map.getOrDefault(matches[i][1],0)+1);
            map.put(matches[i][0], map.getOrDefault(matches[i][0],0));
        }
        List<Integer> l0=new ArrayList<>();
        List<Integer> l1=new ArrayList<>();
        List<List<Integer>> list = new ArrayList<>();
        for(Map.Entry<Integer, Integer> e: map.entrySet()){
            if(e.getValue()==0){
                l0.add(e.getKey());
            }else if(e.getValue()==1){
                l1.add(e.getKey());
            }
        }
        Collections.sort(l0);
        Collections.sort(l1);
        list.add(l0);
        list.add(l1);
        return list;

    }
}