class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int len=grid.length*grid[0].length;
        int[] arr=new int[len];
            for(int j=0;j<grid.length;j++){
                for(int k=0;k<grid.length;k++){
                    arr[grid[j][k]-1]++;
                }
            }
            int[] a=new int[2];
            for(int i=0;i<len;i++){
                if(arr[i]==2){
                    a[0]=i+1;
                }if(arr[i]==0){
                    a[1]=i+1;
                }
            }
            return a;
    }
}