class Solution {
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int temp=nums[i];
            int s=0;
            while(temp>0){
                int d=temp%10;
                s=s+d;
                temp=temp/10;
                if(s>i){
                    break;
                }
            }
            if(s==i){
                return i;
            }
        }
        return -1;
    }
}