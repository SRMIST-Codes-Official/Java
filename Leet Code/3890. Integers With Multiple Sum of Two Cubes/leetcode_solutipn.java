class Solution {
    public List<Integer> findGoodIntegers(int n) {
        HashMap<Integer, Integer> map=new HashMap<>();
        int prod=0;
        for(int i=0;i*i*i<=n;i++){
            for(int j=i;j*j*j<=n;j++){
                prod=(i*i*i)+(j*j*j);
                if(prod>n || prod<=0){
                    break;
                }else{
                    map.put(prod, map.getOrDefault(prod,0)+1);
                }
            }
        }
        List<Integer> l=new ArrayList<>();
        for(Map.Entry<Integer, Integer>e:map.entrySet()){
            if(e.getValue()>=2){
                l.add(e.getKey());
            }
        }
        Collections.sort(l);
        return l;
    }
}