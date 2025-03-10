import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
       List<Integer> list = new ArrayList<>();
       int n=0;
       int c=0;
       int d;
       for(int i =left;i<=right;i++){
        int a=i;
        while(a>0){
            d=a%10;
            n++;
            if(d==0){
                break;
            }
            if(i%d==0){
                c++;
            }
            a=a/10;
        }
        if(c==n){
            list.add(i);
        }
        c=0;
        n=0;
       }
       return list;
    }
}