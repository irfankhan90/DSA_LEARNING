class NQueens {

    static void solveNQueens(int board[][], int row, int n) {
        // base case
        if (row == n) {
            printBoard(board, n);
            System.out.println();
            return;
        }

        // try each column
        for (int col = 0; col < n; col++) {
            if (isSafe(board, row, col, n)) {
                board[row][col] = 1;      // place queen
                solveNQueens(board, row + 1, n);
                board[row][col] = 0;      // backtrack
            }
        }
    }

    static boolean isSafe(int board[][], int row, int col, int n) {

        // check column
        for (int i = 0; i < row; i++)
            if (board[i][col] == 1)
                return false;

        // left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 1)
                return false;

        // right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++)
            if (board[i][j] == 1)
                return false;

        return true;
    }

    static void printBoard(int board[][], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(board[i][j] == 1 ? "Q " : ". ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int n = 4;
        int board[][] = new int[n][n];
        solveNQueens(board, 0, n);
    }
}
