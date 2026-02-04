class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int c=0;
        int w=capacity;
        for(int i=0;i<plants.length;i++){
            if(w>=plants[i]){
                w=w-plants[i];
                c++;
            }else{
                c=c+((i)*2)+1;
                w=capacity-plants[i];
            }
        }
        return c;
    }
}