class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int c=0;
        for(int i=0;i<fruits.length;i++){
            boolean b=false;
            for(int j=0;j<baskets.length;j++){
                if(fruits[i]<=baskets[j]){
                    b=true;
                    baskets[j]=-1;
                    break;
                }
            }
            if(!b){
                c++;
            }
        }
        return c;
    }
}