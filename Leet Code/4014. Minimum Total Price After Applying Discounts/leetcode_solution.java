class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        double results=0.0;
        Arrays.sort(prices);
        Arrays.sort(discounts);
        int i=prices.length-1;
        int j=discounts.length-1;
        while(i>=0 && j>=0){
            results+=(double)(prices[i]*(100-discounts[j]))/100;
            i--;
            j--;
        }
            while(i>=0){
                results+=(double)prices[i];
                i--;
            }
        return results;
    }
}