class Solution {
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        int[][] dis=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                dis[i][j]=(int)1e9;
            }
        }
        for(int i=0;i<edges.length;i++){
            int u=edges[i][0];
            int v=edges[i][1];
            int wt=edges[i][2];
            dis[u][v]=wt;
            dis[v][u]=wt;
        }
        for(int i=0;i<n;i++){
            dis[i][i]=0;
        }
        for(int k=0;k<n;k++){
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    dis[i][j]=Math.min(dis[i][j], dis[i][k]+dis[k][j]);
                }
            }
        }
        int countcity=n;
        int cityno=-1;
        for(int city=0;city<n;city++){
            int c=0;
            for(int i=0;i<n;i++){
                if(dis[city][i]<=distanceThreshold){
                    c++;
                }
            }
            if(c<=countcity){
                countcity=c;;
                cityno=city;
            }
        }
        return cityno;

    }
}