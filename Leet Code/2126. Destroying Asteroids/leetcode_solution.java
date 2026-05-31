class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        long masses=(long)mass;
        for(int i=0;i<asteroids.length;i++){
            if(masses<asteroids[i]){
                return false;
            }else{
                masses+=asteroids[i];
            }
        }
        return true;
    }
}