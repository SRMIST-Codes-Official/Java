class Solution {
    public int[] minCosts(int[] cost) {
        int l=101;
        int[] arr=new int[cost.length];
        for(int i=0;i<cost.length;i++){
            if(cost[i]<l){
                l=cost[i];
            }
            arr[i]=l;
        }
        return arr;
    }
}