class Solution {
    public int minOperations(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                if(!isprime(nums[i])){
                    count+=nextprime(nums[i]) - nums[i];
                }
            }else{
                if(isprime(nums[i])){
                    count+=nextnonprime(nums[i])-nums[i];
                }
            }
        }
        return count;
    }
    int nextnonprime(int n){
        for(int i=n+1;i<999999;i++){
            if(!isprime(i)){
                return i;
            }
        }
        return -1;
    }
    int nextprime(int n){
        for(int i=n+1;i<999999;i++){
            if(isprime(i)){
                return i;
            }
        }
        return -1;
    }
    boolean isprime(int n){
        if(n==1){
            return false;
        }
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}