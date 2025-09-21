class Solution {
    public int smallestAbsent(int[] nums) {
        int sum=0;
        int p=1;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        int avg=sum/nums.length;
        if(avg<0){
            avg=0;
        }
        for(int i= avg+1; i<102;i++){
            if(!is_present(i,nums)){
                p= i;
                break;
            }
        }
        if(p<=0){
            p=1;
        }
        return p;
    }
    boolean is_present(int n, int[] nums){
        for(int i=0;i<nums.length;i++){
            if(n == nums[i]){
                return true;
            }
        }
        return false;
    }
}