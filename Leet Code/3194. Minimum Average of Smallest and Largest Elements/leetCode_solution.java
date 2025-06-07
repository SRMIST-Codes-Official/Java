class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        double [] a=new double[nums.length/2];
        for(int i=0;i<nums.length/2;i++){
            a[i]= (double)(nums[i]+nums[nums.length-i-1])/2;
        }
        double s=a[0];
        for(int i=1;i<a.length;i++){
            if(s>a[i]){
                s=a[i];
            }
        }
        return s;
    }
}