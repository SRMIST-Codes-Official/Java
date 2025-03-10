import java.util.Arrays;

class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int f=nums[nums.length-1];
        int s=nums[nums.length-2];
        int t=nums[nums.length-3];
        int l=nums[0];
        int sl=nums[1];
        int tl=nums[2];
        if(f<0 && s<0 && t<0){
            return f*s*t;
        }
        else if(l*sl>s*t){
            return f*l*sl;
        }
        else{
            return f*s*t;
        }
    }
}