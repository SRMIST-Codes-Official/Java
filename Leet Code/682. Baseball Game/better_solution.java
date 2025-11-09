class Solution {
    public int calPoints(String[] operations) {
        int index=0;
        int[] arr=new int[operations.length];
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("+")){
                arr[index]=arr[index-1]+arr[index-2];
                index++;
            }else if(operations[i].equals("D")){
                arr[index]=arr[index-1]*2;
                index++;
            }else if(operations[i].equals("C")){
                index--;
            }else{
                arr[index]=Integer.parseInt(operations[i]);
                index++;
            }
        }
        int s=0;
        for(int i=0;i<index;i++){
            s+=arr[i];
        }
        return s;
    }
}