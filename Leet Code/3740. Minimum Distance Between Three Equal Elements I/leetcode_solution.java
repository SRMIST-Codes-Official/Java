class Solution {
    public int minimumDistance(int[] nums) {
        int dis=1001;
        int n=nums.length;
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                if(nums[i]==nums[j]){
                    for(int k=j+1;k<n;k++){
                        if(nums[k]==nums[i]){
                            int d=Math.abs(i-j)+Math.abs(j-k)+Math.abs(k-i);
                            dis=Math.min(dis,d);
                        }
                    }
                }
            }
        }
        if(dis==1001){
            return -1;
        }
        return dis;
    }
}