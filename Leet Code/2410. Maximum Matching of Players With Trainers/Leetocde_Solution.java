class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);
        int j=0;
        int c=0;
        for(int i=0;i<players.length;i++){
            for(;j<trainers.length;j++){
                if(players[i]<=trainers[j]){
                    c++;
                    j++;
                    break;
                }
            }
        }
        return c;
    }
}