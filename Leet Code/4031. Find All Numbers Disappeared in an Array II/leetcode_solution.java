class Solution {
    public List<List<Integer>> findDisappearedNumbers(int[] nums, int lower, int upper) {
        HashSet<Integer> set=new HashSet<>();
        for(int n: nums){
            set.add(n);
        }
        List<List<Integer>> l=new ArrayList<>();
        int s=0;
        int e=0;
        boolean c=false;
        for(int i=lower;i<=upper;i++){
            if(!set.contains(i)){
                if(c==false){
                    s=i;
                    c=true;
                }else{
                    e=i;
                }
            }else{
                if(c==true){
                    List<Integer> list=new ArrayList<>();
                    e=i-1;
                    list.add(s);
                    list.add(e);
                    l.add(list);
                    c=false;
                }
            }
        }
        if(c==true){
            List<Integer> list=new ArrayList<>();
            list.add(s);
            list.add(upper);
            l.add(list);
        }
        return l;
    }
}