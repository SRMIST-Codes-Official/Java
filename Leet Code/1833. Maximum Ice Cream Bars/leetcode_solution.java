class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int c=0;
        int i=0;
        int n=costs.length;
        while(coins>0 && i<n){
            coins-=costs[i++];
            if(coins>=0){
                c++;
            }
        }
        return c;
    }
}