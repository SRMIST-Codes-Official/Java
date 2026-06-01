class Solution {
    public int minimumCost(int[] cost) {
        int c=0;
        int costs=0;
        Arrays.sort(cost);
        for(int i=cost.length-1;i>=0;i--){
            c++;
            if(c%3==0){
                continue;
            }else{
                costs+=cost[i];
            }
        }
        return costs;
    }
}