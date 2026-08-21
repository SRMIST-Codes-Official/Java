class Solution {
    public int nearestDrone(int[][] drones, int[] target) {
        int res=Integer.MAX_VALUE;
        int idx=-1;
        for(int i=0;i<drones.length;i++){
            int d=Math.abs(drones[i][0]-target[0])+Math.abs(drones[i][1]-target[1]);
            if(d<=drones[i][2]){
                if(res>d){
                    res=d;
                    idx=i;
                }
            }
        }
        return idx;
    }
}