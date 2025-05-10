class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int a = value(s.charAt(i));
            if(i+1 != s.length()){
                int b=value(s.charAt(i+1));
                if(a<b){
                    sum=sum-a;
                }else{
                    sum=sum+a;
                }
            }else{
                sum=sum+a;
            }
        }
        return sum;

    }

    int value(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
        }
        return 0;
    }
}