class Solution {
    public String largestGoodInteger(String num) {
        int good=000;
        boolean check=false;
        for(int i=1;i<num.length()-1;i++){
            int a=num.charAt(i-1)-'0';
            int b=num.charAt(i)-'0';
            int c=num.charAt(i+1)-'0';
            if(a== b && b==c){
                check=true;
                if(a*100 + b*10 + c >good){
                    good=a*100 + b*10 + c;
                }
            }
        }
        if(!check){
            return "";
        }
        else if(good == 0){
            return "000";
        }
        else{
            return String.valueOf(good);
        }
    }
}