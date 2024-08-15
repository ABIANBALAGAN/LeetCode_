class Solution {
    int[][] arr1;
    int[][] arr2;
    int n;
    public int[] findPermutation(int[] nums) {
        n = nums.length;
        arr1 = new int[1<<n][n];
        arr2 = new int[1<<n][n];
        for(int i = 0; i < (1<<n); i++) {
            for(int j = 0; j < n; j++) {
                arr1[i][j] = Integer.MAX_VALUE;
            }
        }
        dfs(1, 0, nums);
        int[] ans = new int[n];
        int m = 1;
        int p = 0;
        for(int i = 1; i < n; i++) {
            p = arr2[m][p];
            ans[i] = p;
            m += (1<<p);
        }
        return ans;
    }

    public int dfs(int m, int p, int[] nums) {
        if(Integer.bitCount(m)==n) { 
            return Math.abs(p-nums[0]);
        }
        if(arr1[m][p]!=Integer.MAX_VALUE) { 
            return arr1[m][p];
        }
        for(int i = 0; i < n; i++) {
            if((m&(1<<i)) == 0) { 
                int r = Math.abs(p-nums[i]) + dfs(m+(1<<i), i, nums); 
                if(r < arr1[m][p]) { 
                    arr1[m][p] = r;
                    arr2[m][p] = i;
                }
            }
        }
        return arr1[m][p];
    }
}