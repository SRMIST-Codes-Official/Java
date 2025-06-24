class Solution {
    public int[] minOperations(String boxes) {
        int []a = new int[boxes.length()];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                if(boxes.charAt(j)=='1'){
                    a[i]+=Math.abs(i-j);
                }
            }
        }
        return a;
    }
}