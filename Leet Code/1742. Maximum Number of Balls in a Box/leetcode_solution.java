class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=lowLimit;i<=highLimit;i++){
            int s=sod(i);
            map.put(s,map.getOrDefault(s,0)+1);
        }
        int max=0;
        for(int nums:map.values()){
            if(nums>max){
                max=nums;
            }
        }
        return max;

    }
    int sod(int n){
        int s=0;
        while(n>0){
            int d=n%10;
            s+=d;
            n=n/10;
        }
        return s;
    }
}