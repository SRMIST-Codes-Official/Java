class Solution {
    public int calPoints(String[] operations) {
        Stack <Integer> s= new Stack<>();
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("D")){
                s.push(s.get(s.size()-1)*2);
            }else if(operations[i].equals("C")){
                s.pop();
            }else if(operations[i].equals("+")){
                s.push(s.get(s.size()-1)+s.get(s.size()-2));
            }else{
                s.push(Integer.parseInt(operations[i]));
            }
        }
        int sum=0;
        for(int nums : s){
            sum+=nums;
        }
        return sum;
    }
}
