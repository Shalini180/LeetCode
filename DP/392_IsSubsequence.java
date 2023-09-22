class Solution {
    public int helper(String s, String t, int i, int j, int[][] dp){
        if(i == 0 || j == 0)
        return 0;
        
        if(dp[i][j] != -1)
        return dp[i][j];

        if(s.charAt(i-1) == t.charAt(j-1))
        return dp[i][j] = 1 + helper(s,t,i-1,j-1,dp);

        return dp[i][j] = helper(s,t,i,j-1,dp);
    }

    public boolean isSubsequence(String s, String t) {
        int n = s.length();
        int m = t.length();
        int[][]dp = new int[n+1][m+1];
        for(int[] it: dp)
        Arrays.fill(it, -1);
        if(helper(s,t,n,m,dp) == n)
        return true;

        return false;
    }
}
