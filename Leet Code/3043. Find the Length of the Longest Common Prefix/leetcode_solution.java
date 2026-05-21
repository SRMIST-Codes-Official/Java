class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        int m=-1;
        Set<Integer> s1=new HashSet<>();
        Set<Integer> s2=new HashSet<>();
        for(int i=0;i<arr2.length;i++){
            while(arr2[i]>0){
                s1.add(arr2[i]);
                arr2[i]=arr2[i]/10;
            }
        }
        for(int i=0;i<arr1.length;i++){
            while(arr1[i]>0){
                s2.add(arr1[i]);
                arr1[i]=arr1[i]/10;
            }
        }
        for(int n:s1){
            if(s2.contains(n)){
                m=Math.max(m,n);
            }
        }
        if(m==-1){
            return 0;
        }
        int c=0;
        while(m>0){
            c++;
            m=m/10;
        }
        return c;
    }
}