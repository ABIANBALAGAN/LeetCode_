class Solution {
    public int fibo(int n,int[] dp){
        if(n==0||n==1){
            return n;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        else{
            dp[n]=fibo(n-2,dp)+fibo(n-1,dp);
        }
        return dp[n];
    }
    public int fib(int n) {
        int[] dp=new int[n+1];
        for(int i=0;i<dp.length;i++){
            dp[i]=-1;
        }
        return fibo(n,dp);
    }
}