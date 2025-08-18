class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> l = new ArrayList<>();
        int j=0;
        for(int i=1;i<=target[target.length-1];i++){
            if(target[j]==i){
                l.add("Push");
                j++;
            }else{
                l.add("Push");
                l.add("Pop");
            }
        }
        return l;
    }
}