class Solution {
    public double largestTriangleArea(int[][] points) {
        double area = 0.0;
        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                for (int k = j + 1; k < points.length; k++) {
                    double a = (0.5) * Math.abs(
                            (points[i][0] * (points[j][1] - points[k][1]) + points[j][0] * (points[k][1] - points[i][1])
                                    + points[k][0] * (points[i][1] - points[j][1])));
                    if (a > area) {
                        area = a;
                    }
                }
            }
        }
        return area;
    }
}
