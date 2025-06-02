class Solution {
    public int diagonalSum(int[][] mat) {
        int s=0;
        int l=mat.length;
        for(int i=0;i<l;i++){
            s=s+mat[i][i];
        }
        for(int i=0;i<l;i++){
            s=s+mat[i][l-i-1];
        }
        if(l%2!=0){
            return s-mat[(int)l/2][(int)l/2];
        }
        return s;
    }
}