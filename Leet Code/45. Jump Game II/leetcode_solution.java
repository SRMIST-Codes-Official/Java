class Solution {
    public int jump(int[] nums) {
        int n=nums.length;
        int[] jc=new int[n];
        Arrays.fill(jc, 100000);
        jc[0]=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<=i+nums[i];j++){
                if(j>=n){
                    break;
                }else{
                    jc[j]=Math.min(jc[j],jc[i]+1);
                }
            }
        }
        return jc[n-1];
    }
}