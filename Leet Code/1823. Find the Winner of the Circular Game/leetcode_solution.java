class Solution {
    public int findTheWinner(int n, int k) {
        ArrayList<Integer> l=new ArrayList<>();
        for(int i=1;i<=n;i++){
            l.add(i);
        }
        int c=0;
        int m=0;
        while(l.size()>1){
            c++;
            if(c==k){
                l.remove(l.get(m));
                c=0;
                m--;
            }
            m++;
            if(m>=l.size()){
                m=0;
            }
        }
        return l.get(0);
    }
}