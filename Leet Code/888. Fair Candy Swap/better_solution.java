class Solution {
    public int[] fairCandySwap(int[] a, int[] b) {
        int s1=0;
        int s2=0;
        Set<Integer> set = new HashSet<>();
        int[] result=new int[2];
        for(int i=0;i<a.length;i++){
            s1+=a[i];
        }
        for(int i=0;i<b.length;i++){
            s2+=b[i];
            set.add(b[i]);
        }
        int e=(s1+s2)/2;
        for(int i=0;i<a.length;i++){
            int v=e-s1+a[i];
            if(set.contains(v)){
                result[0]=a[i];
                result[1]=v;
                return result;
            }
        }
        return result;
    }
}