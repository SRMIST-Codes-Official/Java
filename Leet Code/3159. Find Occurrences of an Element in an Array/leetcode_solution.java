class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==x){
                c++;
            }
        }
        int[] index=new int[c];
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==x){
                index[j++]=i;
            }
        }
        int[] arr=new int[queries.length];
        for(int i=0;i<queries.length;i++){
            if(queries[i]-1 >= index.length){
                arr[i]=-1;
                continue;
            }else{
                arr[i]=index[queries[i]-1];
            }
        }
        return arr;
    }
}