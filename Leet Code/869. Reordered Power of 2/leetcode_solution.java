class Solution {
    public boolean reorderedPowerOf2(int n) {
        HashMap<Integer, Integer>[] arr = new HashMap[30];
        for(int i=0;i<30;i++){
            arr[i] = new HashMap<>();
            int v=(int)Math.pow(2,i);
            while(v>0){
                int d=v%10;
                arr[i].put(d,arr[i].getOrDefault(d,0)+1);
                v=v/10;
            }
        }
        HashMap<Integer, Integer> map=new HashMap<>();
        while(n>0){
            int d=n%10;
            map.put(d,map.getOrDefault(d,0)+1);
            n=n/10;
        }
        for(int i=0;i<30;i++){
            if(arr[i].equals(map)){
                return true;
            }
        }
        return false;
    }
}