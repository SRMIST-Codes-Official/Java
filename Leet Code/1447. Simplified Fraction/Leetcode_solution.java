class Solution {
    public List<String> simplifiedFractions(int n) {
        List<String> l = new ArrayList<>();
        for(int i=2;i<=n;i++){
            l.add(1+"/"+i);
        }
        int c=0;
        for(int i=2;i<n;i++){
            for(int j=i+1;j<=n;j++){
                for(int k=2;k<=i;k++){
                    if(i%k!=0 || j%k!=0){
                        c++;
                    }
                }
                if(c==i-1){
                    l.add(i+"/"+j);
                }
                c=0;
            }
        }
        return l;
    }
}