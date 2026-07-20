class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        ArrayList<Integer> l=new ArrayList<>();
        int n=grid.length;
        int m=grid[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                l.add(grid[i][j]);
            }
        }
        k=k%(n*m);
        ArrayList<Integer> res=new ArrayList<>();
        for(int i=(n*m)-k;i<(n*m);i++){
            res.add(l.get(i));
        }
        for(int i=0;i<(n*m)-k;i++){
            res.add(l.get(i));
        }
        List<List<Integer>> ans=new ArrayList<>();
        int cnt=0;
        for(int i=0;i<n;i++){
            List<Integer> row=new ArrayList<>();
            for(int j=0;j<m;j++){
                row.add(res.get(cnt++));
            }
            ans.add(row);
        }
        return ans;
    }
}