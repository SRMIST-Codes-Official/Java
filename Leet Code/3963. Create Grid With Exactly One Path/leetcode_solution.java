class Solution {
    public String[] createGrid(int m, int n) {
        String[] res=new String[m];
        String initial=".";
        for(int i=0;i<n-1;i++){
            initial=initial+"#";
        }
        for(int i=0;i<m-1;i++){
            res[i]=initial;
        }
        String last="";
        for(int i=0;i<n;i++){
            last=last+".";
        }
        res[m-1]=last;
        return res;
    }
}