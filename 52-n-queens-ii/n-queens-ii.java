class Solution {
     public boolean isSafe(int row, int col, char[][] board, int n) {
        int i, j;
        for (j = col - 1; j >= 0; j--) {
            if (board[row][j] == 'Q') {
                return false;
            }
        }
     for (i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

    for (i = row + 1, j = col - 1; i < n && j >= 0; i++, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }
    public void solve(char[][] board, int col, int n, int[] count) {
        if (col == n) {
            count[0]++;
            return;
        }

        for (int row = 0; row < n; row++) {
            if (isSafe(row, col, board, n)) {
                board[row][col] = 'Q';
                solve(board, col + 1, n, count);
                board[row][col] = '.';
            }
        }
    }

    public int totalNQueens(int n) {
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        int[] count = new int[1];
        solve(board, 0, n, count);
        return count[0];
    }
}