class Solution {
    public int numberOfBeams(String[] bank) {
        int cc=0;
        int pc=0;
        int b=0;
        for(int i=0;i<bank.length;i++){
            for(int j=0;j<bank[i].length();j++){
                if(bank[i].charAt(j)=='1'){
                    cc++;
                }
            }
            b=b+ (pc*cc);
            if(cc!=0){
                pc=cc;
            }
            cc=0;
        }
        return b;
    }
}