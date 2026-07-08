class Solution {
    public String intToRoman(int num) {
        int th=num/1000;
        num=num%1000;
        int fh=num/500;
        num=num%500;
        int h=num/100;
        num=num%100;
        int fi=num/50;
        num=num%50;
        int t=num/10;
        num=num%10;
        int f=num/5;
        num=num%5;
        int o=num;
        String s="";
        for(int i=0;i<th;i++){
            s=s+"M";
        }
        if(fh==1 && h==4){
            s=s+"CM";
            h=h-4;
        }else if(fh==1){
            s=s+"D";
        }
        if(fh==0 && h==4){
            s=s+"CD";
            h=h-4;
        }else{
            for(int i=0;i<h;i++){
                s=s+"C";
            }
        }
        if(fi==1 && t==4){
            s=s+"XC";
            t=t-4;
        }else if(fi==1){
            s=s+"L";
        }
        if(t==4){
            s=s+"XL";
            t=t-4;
        }else{
            for(int i=0;i<t;i++){
                s=s+"X";
            }
        }
        if(f==1 && o==4){
            s=s+"IX";
            o=o-4;
        }else if(f==1){
            s=s+"V";
        }
        if(o==4 && f!=1){
            s=s+"IV";
            o=o-4;
        }else{
            for(int i=0;i<o;i++){
                s=s+"I";
            }
        }
        return s;
    }
}