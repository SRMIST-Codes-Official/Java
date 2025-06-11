class Solution {
    public int maxDifference(String s) {
        int of=999;
        int ef=0;
        char[] ca = s.toCharArray();
        for(int i=0;i<s.length();i++){
            int f=1;
            if(ca[i]!='0'){
              for(int j=i+1;j<ca.length;j++){
                if(ca[i]==ca[j]){
                    f++;
                    ca[j]='0';
                }
              }  
            }
            if(f%2==0 && f<of){
                of=f;
            }else if(f%2!=0 && f>ef){
                ef=f;
            }
            ca[i]='0';
        }
        if(of==999){
            return ef;
        }
        return ef-of;
    }
}