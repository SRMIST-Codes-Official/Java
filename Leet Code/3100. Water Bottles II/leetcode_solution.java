class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int c=numBottles;
        int e=numBottles;
        while(e>=numExchange){
            e=e-numExchange;
            numExchange++;
            c++;
            e++;
        }
        return c;
    }
}