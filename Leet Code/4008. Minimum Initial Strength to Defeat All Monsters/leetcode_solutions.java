class Solution {
    public long minInitialStrength(int[] monsters, int[][] boosts) {
        int n=monsters.length;
        long[] diff=new long[n+1];
        for(int[] a: boosts){
            int l=a[0];
            int r=a[1];
            int v=a[2];
            diff[l]+=v;
            if(r+1<n){
                diff[r+1]-=v;
            }
        }
        long[] bonus=new long[n];
        long cur=0;
        for(int i=0;i<n;i++){
            cur+=diff[i];
            bonus[i]=cur;
        }
        long low=0;
        long high=0;
        for(int x:monsters){
            high+=x;
        }
        long ans=high;
        while(low<=high){
            long mid=low+(high-low)/2;
            if(canDefeat(mid,monsters,bonus)){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
    boolean canDefeat(long s, int[]monsters, long[] bonus){
        long curr=s;
        for(int i=0;i<monsters.length;i++){
            if(curr+bonus[i]<monsters[i]){
                return false;
            }
            curr-=monsters[i];
            if(curr<0){
                curr=0;
            }
        }
        return true;
    }
}