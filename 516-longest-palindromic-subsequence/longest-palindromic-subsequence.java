class Solution {
    public int LPS(String str,int s,int e,int[][] dp){
        if(s>e){
            return 0;
        }
        if(s==e){
            return 1;
        }
        if(dp[s][e]!=-1){
            return dp[s][e];
        }
        else if(str.charAt(s)==str.charAt(e)){
            dp[s][e]=2+LPS(str,s+1,e-1,dp);
        }
        else{
            dp[s][e]=Math.max(LPS(str,s+1,e,dp),LPS(str,s,e-1,dp));
        }
        return dp[s][e];
    }
    public int longestPalindromeSubseq(String s) {
        int n;
        n=s.length();
        int[][] dp=new int[n][n];
        int i,j;
        for(i=0;i<=n-1;i++){
            for(j=0;j<=n-1;j++){
                dp[i][j]=-1;
            }
        }
        return LPS(s,0,s.length()-1,dp);
    }
}