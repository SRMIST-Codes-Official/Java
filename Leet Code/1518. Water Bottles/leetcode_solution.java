class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int c=numBottles;
        int f=0;
        int e=c;
        while(e>=numExchange || f>0){
            f=e/numExchange;
            e=e%numExchange;
            c+=f;
            e+=f;
            f=0;
        }
        return c+f;

    }
}