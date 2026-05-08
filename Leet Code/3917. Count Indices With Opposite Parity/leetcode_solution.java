class Solution {
    public int[] countOppositeParity(int[] nums) {
        int ec=0;
        int oc=0;
        int n=nums.length;
        int[] r=new int[n];
        for(int i=0;i<n;i++){
            if(nums[i]%2==0){
                ec++;
            }else{
                oc++;
            }
        }
        for(int i=0;i<n;i++){
            if(nums[i]%2==0){
                ec--;
                r[i]=oc;
            }else{
                oc--;
                r[i]=ec;
            }
        }
        return r;
    }
}