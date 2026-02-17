class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        boolean[] arr=new boolean[101];
        for(int x: bulbs){
            arr[x]=!arr[x];
        }
        List<Integer> l=new ArrayList<>();
        for(int i=1;i<arr.length;i++){
            if(arr[i]){
                l.add(i);
            }
        }
        return l;
    }
}