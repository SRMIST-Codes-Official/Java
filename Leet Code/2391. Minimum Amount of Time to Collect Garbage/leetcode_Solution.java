class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int m=-1;
        int g=-1;
        int p=-1;
        int t=0;
        for(int i=0;i<garbage.length;i++){
            if(garbage[i].indexOf('M')!=-1){
                m=i;
            }
            if(garbage[i].indexOf('G')!=-1){
                g=i;
            }
            if(garbage[i].indexOf('P')!=-1){
                p=i;
            }
        }
        for(int i=0;i<=m;i++){
            t+=count(garbage[i],'M');
            if(i+1 <= m && i<travel.length){
                t+=travel[i];
            }
        }
        for(int i=0;i<=p;i++){
            t+=count(garbage[i],'P');
            if(i+1 <= p && i<travel.length){
                t+=travel[i];
            }
        }
        for(int i=0;i<=g;i++){
            t+=count(garbage[i],'G');
            if(i+1 <= g && i<travel.length){
                t+=travel[i];
            }
        }
        return t;
    }
    int count(String a, char b){
        int c=0;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)==b){
                c++;
            }
        }
        return c;
    }
}