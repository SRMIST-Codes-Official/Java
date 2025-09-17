class Solution {
    public List<Integer> replaceNonCoprimes(int[] nums) {
        List<Integer> l = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            l.add(nums[i]);
        }
        for(int i=0;i<l.size()-1;i++){
            if(non_coprime(l.get(i),l.get(i+1))){
                l.set(i+1,lcm(l.get(i),l.get(i+1)));
                l.remove(i);
                i=Math.max(-1, i-2);;
            }
        }
        return l;
    }
    boolean non_coprime(int a, int b) {
        return gcd(a, b) > 1;
    }
    int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    int lcm(int a, int b) {
        return (a / gcd(a,b)) * b;
    }
}