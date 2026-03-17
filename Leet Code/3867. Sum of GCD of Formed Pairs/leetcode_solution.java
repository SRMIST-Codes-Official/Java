class Solution {

    public long gcdSum(int[] nums) {
        int n=nums.length;
        long[] prefixGcd = new long[n];
        int mx = 0;
        for(int i = 0; i < n; i++){
            mx = Math.max(mx, nums[i]);
            prefixGcd[i] = gcd(nums[i], mx);
        }
        Arrays.sort(prefixGcd);
        long sum = 0;
        int l = 0, r = n - 1;
        while(l < r){
            sum += gcd(prefixGcd[l], prefixGcd[r]);
            l++;
            r--;
        }
        return sum;
    }
    long gcd(long a, long b){
        while(b != 0){
            long t = a % b;
            a = b;
            b = t;
        }
        return a;
    }
}