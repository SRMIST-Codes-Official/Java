class Solution {
    public String countAndSay(int n) {
        String num = "1";
        for (int i = 1; i <= n-1; i++) {
            num=rle(num);
        }
        return num;
    }
    String rle(String n){
        String num="";
        for(int i=0;i<n.length();i++){
            int a=1;
            for(int j=i+1;j<n.length();j++){
                if(n.charAt(i)==n.charAt(j)){
                    a++;
                }else{
                    break;
                }
            }
            num=num+a+n.charAt(i);
            i=i+a-1;
        }
        return num;
    }

}