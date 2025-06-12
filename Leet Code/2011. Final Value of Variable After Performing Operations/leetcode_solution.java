class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int c=0;
        for(int i=0;i<operations.length;i++){
            if(operations[i].charAt(0)=='+' || operations[i].charAt(2)=='+'){
                c++;
            }else{
                c--;
            }
        }
        return c;
    }
}