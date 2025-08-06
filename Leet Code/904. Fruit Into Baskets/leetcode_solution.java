class Solution {
    public int totalFruit(int[] fruits) {
        int m=0;
        for(int i=0;i<fruits.length;i++){
            int f=fruits[i];
            int s=fruits[i];
            int n=0;
            if(m>fruits.length-i){
                return m;
            }
            for(int j=i;j<fruits.length;j++){
                if(f==s && fruits[j]!=f){
                    s=fruits[j];
                }
                if(fruits[j]==f || fruits[j]==s){
                    n++;
                    if(m<n){
                        m=n;
                    }
                }else{
                    break;
                }
            }
        }
        return m;
    }
}