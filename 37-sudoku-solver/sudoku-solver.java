class Solution {
    public static boolean isSafe(char[][] board, int row, int col, char digit) {
        for (int j = 0; j <= 8; j++) {
            if (board[row][j] == digit) {
                return false;
            }
        }
        for (int i = 0; i <= 8; i++) {
            if (board[i][col] == digit) {
                return false;
            }
        }
        int x = row / 3 * 3;
        int y = col / 3 * 3;
        for (int i = x; i <= x + 2; i++) {
            for (int j = y; j <= y + 2; j++) {
                if (board[i][j] == digit) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean solve(char[][] board, int row, int col) {
        if (row == 9) {
            return true;
        }
        if (col == 9) {
            return solve(board, row + 1, 0);
        }
        if (board[row][col] == '.') {
            for (char digit = '1'; digit <= '9'; digit++) {
                if (isSafe(board, row, col, digit)) {
                    board[row][col] = digit;
                    if (solve(board, row, col + 1)) {
                        return true;
                    }
                    board[row][col] = '.';
                }
            }
        } else {
            return solve(board, row, col + 1);
        }
        return false;
    }

    public static void solveSudoku(char[][] board) {
        solve(board, 0, 0);
    }
}
