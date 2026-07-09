class Solution {
    public String intToRoman(int num) {
        int[] n={1000, 900, 500, 400, 100, 90,50,40,10,9,5,4,1};
        String[] roman={"M","CM", "D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder res=new StringBuilder();
        for(int i=0;i<n.length;i++){
            while(n[i]<=num){
                res.append(roman[i]);
                num=num-n[i];
            }
        }
        return res.toString();
    }
}