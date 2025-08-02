class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> tree = new ArrayList<>();
        List<Integer> first =new ArrayList<>();
        first.add(1);
        tree.add(first);
        for(int i=1;i<numRows;i++){
            List<Integer> row =new ArrayList<>();
            row.add(1);
            for(int j=1;j<i;j++){
                row.add(tree.get(i-1).get(j-1) + tree.get(i-1).get(j) );
            }
            row.add(1);
            tree.add(row);
        }
        return tree;
    }
}