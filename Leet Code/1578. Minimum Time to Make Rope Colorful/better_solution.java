class Solution {
    public int minCost(String colors, int[] neededTime) {
        char a=colors.charAt(0);
        int j=0;
        int t=0;
        for(int i=1;i<colors.length();i++){
            if(colors.charAt(i)==a){
                t+=Math.min(neededTime[j], neededTime[i]);
                if(neededTime[j]<=neededTime[i]){
                    a=colors.charAt(i);
                    j=i;
                }
            }else{
                a=colors.charAt(i);
                j=i;
            }
        }
        return t;
    }
}