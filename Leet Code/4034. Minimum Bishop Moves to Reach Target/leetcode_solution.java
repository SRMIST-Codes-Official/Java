class Solution {
    public int minBishopMoves(int[] source, int[] target) {
        int s=0;
        int t=0;
        if((source[0]%2==0 && source[1]%2==0) || (source[0]%2!=0 && source[1]%2!=0)){
            s=1;
        }
        if((target[0]%2==0 && target[1]%2==0) || (target[0]%2!=0 && target[1]%2!=0)){
            t=1;
        }
        if(s!=t){
            return -1;
        }
        if(source[0]+source[1]== target[0]+target[1] || (source[0]-source[1] == target[0]-target[1])){
            return 1;
        }
        return 2;

    }
}