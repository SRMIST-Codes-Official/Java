class Solution {
    public int compareVersion(String version1, String version2) {
        int v1l=count(version1)+1;
        int v2l=count(version2)+1;
        int l=0;
        if(v1l>=v2l){
            l=v1l;
        }else{
            l=v2l;
        }
        int[] v1=new int[l];
        int[] v2=new int[l];
        String[] tv1=version1.split("\\.");
        String[] tv2=version2.split("\\.");
        for(int i=0;i<tv1.length;i++){
            v1[i]=Integer.parseInt(tv1[i]);
        }
        for(int i=0;i<tv2.length;i++){
            v2[i]=Integer.parseInt(tv2[i]);
        }
        for(int i=0;i<l;i++){
            if(v1[i]>v2[i]){
                return 1;
            }
            else if(v2[i]> v1[i]){
                return -1;
            }
        }
        return 0;
    }
    int count(String s){
        int c=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '.'){
                c++;
            }
        }
        return c;
    }
}