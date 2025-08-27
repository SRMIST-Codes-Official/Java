class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int maxd=0;
        int area=0;
        for(int i=0;i<dimensions.length;i++){
            int l=dimensions[i][0];
            int b=dimensions[i][1];
            int d=l*l + b*b;
            if(d>maxd){
                maxd=d;
                area=l*b;
            }else if(d==maxd){
                area=Math.max(area,l*b);
            }
        }
        return area;
    }
}