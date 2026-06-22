class Solution {
    public double angleClock(int hour, int minutes) {
        double md=minutes *6.0;
        double hd=hour*30 + minutes*0.5;
        double a=Math.abs(md-hd);
        return Math.min(a,360-a);
    }
}