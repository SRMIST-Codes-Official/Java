class Solution {
    public int[] scoreValidator(String[] events) {
        int[] arr=new int[2];
        for(int i=0;i<events.length;i++){
            if(events[i].equals("WD") || events[i].equals("NB")){
                arr[0]+=1;
            }else if(events[i].equals("W")){
                arr[1]++;
            }else{
                arr[0]+=events[i].charAt(0)-'0';
            }
            if(arr[1]==10){
                return arr;
            }
        }
        return arr;
    }
}