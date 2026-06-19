class Solution {
    Double[][][] dp;
    public double knight(int n, int k, int row, int column) {
        int[][] moves = {{-2,-1},{2,-1},{-2,1},{2,1},{-1,-2},{-1,2},{1,-2},{1,2}};
        double var = 0;
        
        if(row<0 || column <0 || row>=n ||column >= n)return 0;
        if(k == 0)return 1;
        if(dp[row][column][k] != null)return dp[row][column][k]; 
        for(int i=0;i<8;i++) {
            var+=knight(n,k-1,row+moves[i][0],column+moves[i][1])/8.0;
        }
        return dp[row][column][k] = var;

    }
    public double knightProbability(int n, int k, int row, int column) {
        dp = new Double[n][n][k+1];
        return knight(n,k,row,column);
    }
}