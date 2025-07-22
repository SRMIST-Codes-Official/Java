class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> list= new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            int index=-1;
            int s=999999;
            int l=-1;
            for(int j=0;j<matrix[i].length;j++){
                if(s>matrix[i][j]){
                    s=matrix[i][j];
                    index=j;
                }
            }
            for(int j=0;j<matrix.length;j++){
                if(matrix[j][index]>l){
                    l=matrix[j][index];
                }
            }
            if(l==s){
                list.add(s);
            }
        }
        return list;
    }
}