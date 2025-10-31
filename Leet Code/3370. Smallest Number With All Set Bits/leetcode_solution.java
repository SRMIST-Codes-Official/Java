class Solution {
    public int smallestNumber(int n) {
        int num=1;
        for(int i=0;i<10;i++){
            num=num*2;
            if(num>n){
                return num-1;
            }
        }
        return num;
    }
}