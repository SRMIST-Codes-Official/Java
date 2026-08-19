class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        HashMap<Integer, List<Integer>> map=new HashMap<>();
        for(int i=0;i<reservedSeats.length;i++){
            int r=reservedSeats[i][0];
            int c=reservedSeats[i][1];
            if(map.containsKey(r)){
                map.get(r).add(c);
            }else{
                List<Integer> l=new ArrayList<>();
                l.add(c);
                map.put(r,l);
            }
        }
        int c=0;
        for(Map.Entry<Integer, List<Integer>> e: map.entrySet()){
            int[] seats=new int[11];
            for(int seat : e.getValue()){
                seats[seat]=1;
            }
            if(seats[2]==0 && seats[3]==0 && seats[4]==0 && seats[5]==0){
                c++;
                seats[2]=1;
                seats[3]=1;
                seats[4]=1;
                seats[5]=1;
            }
            if(seats[4]==0 && seats[5]==0 && seats[6]==0 && seats[7]==0){
                c++;
                seats[4]=1;
                seats[5]=1;
                seats[6]=1;
                seats[7]=1;
            }
            if(seats[6]==0 && seats[7]==0 && seats[8]==0 && seats[9]==0){
                c++;
            }
        }
        return c+ (n-map.size()) * 2; 
    }
}
