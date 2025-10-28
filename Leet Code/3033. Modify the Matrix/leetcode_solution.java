class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        int[] m= new int[matrix[0].length];
        for(int i=0;i<matrix[0].length;i++){
            for(int j=0;j<matrix.length;j++){
                if(matrix[j][i]>m[i]){
                    m[i]=matrix[j][i];
                }
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==-1){
                    matrix[i][j]=m[j];
                }
            }
        }
        return matrix;
    }
}