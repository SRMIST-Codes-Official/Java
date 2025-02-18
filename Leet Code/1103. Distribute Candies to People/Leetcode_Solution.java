class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int [] d= new int[num_people];
        int i=0;
        int x=1;
        while(candies>0){
            if(x<=candies){
                d[i]=d[i]+x;
            }
            else{
                d[i]=d[i]+candies;
            }
            candies=candies-x;
            x=x+1;
            if(i==num_people-1){
                i=-1;
            }
            i=i+1;
        }
        return d;
    }
}