class Solution {
    public int minSetSize(int[] arr) {
        HashMap<Integer, Integer> map= new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }
        int[] freq=new int[arr.length];
        int c=0;
        for(Integer value: map.values()){
            freq[c++]=value;
        }
        Arrays.sort(freq);
        int count=0;
        int size=0;
        for(int i=freq.length-1;i>=0;i--){
            count=count+freq[i];
            size++;
            if(count >= arr.length/2){
                break;
            }
        }
        return size;
    }
}