class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int c=0;
        for(int i=0;i<seats.length;i++){
            c+= Math.abs(seats[i]-students[i]);
        }
        return c;
    }
}