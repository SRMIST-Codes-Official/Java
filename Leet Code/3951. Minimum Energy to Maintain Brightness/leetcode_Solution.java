class Solution {
    public long minEnergy(int n, int brightness, int[][] intervals) {
        long t=0;
        long len=intervals.length;
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        List<int[]>ans=new ArrayList<>();
        for(int i=0;i<len;i++){
            if(ans.isEmpty() || intervals[i][0]>ans.get(ans.size()-1)[1]){
                ans.add(intervals[i]);
            }else{
                ans.get(ans.size()-1)[1]=Math.max(ans.get(ans.size()-1)[1], intervals[i][1]);
            }
        }
        int[][] res=ans.toArray(new int[ans.size()][]);
        for(int i=0;i<res.length;i++){
            t+=res[i][1]-res[i][0]+1;
        }
        long l=(long)(Math.ceil(brightness/3.0));
        return (long)l*t;
    }
}