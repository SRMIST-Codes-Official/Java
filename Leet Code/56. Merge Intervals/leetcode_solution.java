class Solution {
    public int[][] merge(int[][] intervals) {
        int[] arr=new int[20002];
        for(int i=0;i<intervals.length;i++){
            for(int j=intervals[i][0]*2;j<=intervals[i][1]*2;j++){
                arr[j]=1;
            }
        }
        List <int[]> l=new ArrayList<>();
        int start=-1;
        int end=-1;
        for(int i=0;i<20002;i++){
            if(arr[i]==1){
                if(start==-1){
                    start=i;
                    end=i;
                }else{
                    end=i;
                }
            }else{
                if(start!=-1 && end!=-1){
                    l.add(new int[]{start/2,end/2});
                    start=-1;
                    end=-1;
                }
            }
        }
        int[][] res=new int[l.size()][2];
        for(int i=0;i<res.length;i++){
            res[i]=l.get(i);
        }
        return res;
    }
}