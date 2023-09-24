class Solution {
    public double champagneTower(int poured, int query_row, int query_glass) {
        double[] prevRow = new double[1];
        prevRow[0] = poured;

        for(int i = 1;i<query_row + 1; i++){
            double[] currRow = new double[i+1];
            Arrays.fill(currRow, 0);
            for(int j = 0;j < i; j++){
                double extra = prevRow[j] - 1;
                if(extra > 0) {
                currRow[j] += 0.5 * extra;
                currRow[j+1] += 0.5 * extra;
                }
            }
            prevRow = currRow;
        }

        return Math.min(1, prevRow[query_glass]);
    }
}
