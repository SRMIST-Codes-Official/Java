class Solution {
    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer> num = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            num.add(nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            num.add(rev(nums[i]));
        }
        return num.size();


    }
    int rev(int n){
        int r=0;
        while(n>0){
            int d=n%10;
            r=r*10 + d;
            n=n/10;
        }
        return r;
    }
}