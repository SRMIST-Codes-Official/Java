class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l=1;
        int r=0;
        for(int i=0;i<piles.length;i++){
            r=Math.max(piles[i],r);
        }
        while(l<=r){
            int mid=l+(r-l)/2;
            long t=0;
            for(int i=0;i<piles.length;i++){
                t+=(long)Math.ceil((double)piles[i]/mid);
            }
            if(t<=h){
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return l;
    }
}