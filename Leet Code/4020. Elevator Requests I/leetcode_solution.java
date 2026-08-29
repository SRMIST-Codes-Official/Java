class Solution {
    public int elevatorRequests(int n, int[] requests) {
        int t=requests[0];
        for(int i=1;i<requests.length;i++){
            t+=Math.abs(requests[i]-requests[i-1]);
        }
        return t;
    }
}