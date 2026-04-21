class Solution {
    public int maxDistance(int[] colors) {
        int dis=0;
        for(int i=0;i<colors.length;i++){
            for(int j= i+1;j<colors.length;j++){
                if(colors[i]!=colors[j]){
                    dis=Math.max(dis, Math.abs(i-j));
                }
            }
        }
        return dis;
    }
}