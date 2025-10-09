class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int[] pairs = new int[spells.length];
        for (int i = 0; i < spells.length; i++) {
            int bs = binarysearch(0, potions.length - 1, potions, success, spells[i]);
            if(bs==-1){
                pairs[i]=0;
            }else{
                pairs[i] = potions.length - bs;
            }
        }
        return pairs;
    }
    int binarysearch(int s, int e, int[] arr, long key, int v) {
        if (s > e) return -1;
        int m = s + (e - s) / 2;
        long val = (long) arr[m] * v;
        if (val >= key) {
            if (m == 0 || (long) arr[m - 1] * v < key)
                return m;
            else
                return binarysearch(s, m - 1, arr, key, v);
        } 
        else {
            return binarysearch(m + 1, e, arr, key, v);
        }
    }
}