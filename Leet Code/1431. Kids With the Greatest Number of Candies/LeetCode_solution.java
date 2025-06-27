class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int m=0;
        for(int i=0;i<candies.length;i++){
            if(candies[i]>m){
                m=candies[i];
            }
        }
        List<Boolean> boolList = new ArrayList<>();
        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies>=m){
                boolList.add(true);
            }else{
                boolList.add(false);
            }
        }
        return boolList;
    }
}