 class Solution {
    public boolean isPerfectSquare(int num) {
        double ans = (double) Math.pow(num,0.5);
        int abs = (int) ans;
        if(ans%abs==0)
        return true;
        return false;
    }
}