class Solution {
    public int numTeams(int[] ratings) {
        int count=0;
        int n=ratings.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(ratings[i]<ratings[j] && ratings[j]<ratings[k] || ratings[i]>ratings[j] && ratings[j]>ratings[k]){
                        count++;
                    }
                    
                }
            }
        }
        return count;
    }
}