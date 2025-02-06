class Solution {
    public int[][] kClosest(int[][] points, int k) {
        //sqrt((points[0][0]*points[0][0])+(points[0][1]*points[0][1]));
        double []dist=new double[points.length];
        for(int i=0;i<points.length;i++){
            dist[i]=Math.sqrt((points[i][0]*points[i][0])+(points[i][1]*points[i][1]));
        }
        int [][] arr=new int[k][2];
        double d=dist[0];
        int index=0;
        for(int j=0;j<k;j++){ 
            for(int i=1;i<dist.length;i++){
                if(dist[i]<d){
                   d=dist[i];
                   index=i;
                }
            }
            arr[j][0]=points[index][0];
            arr[j][1]=points[index][1];
            dist[index]=20000;//since max dist can be 10000*sqrt(2) as per constraint given in question
            index=0;
            d=dist[0];
        }
        return arr;
    }
}
    
