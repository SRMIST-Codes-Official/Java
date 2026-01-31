class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int c=0;
        for(int i=piles.length/3;i<piles.length;i=i+2){
            c=c+piles[i];
        }
        return c;
    }
}