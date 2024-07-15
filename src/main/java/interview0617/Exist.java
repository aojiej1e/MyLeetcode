package interview0617;

/**
 * @author aojie
 * @Function
 * @create 2024-07-04 17:03
 */
public class Exist {
    public static void main(String[] args) {
        char[][] req = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        System.out.println(new Exist().exist(req, "ABCB"));
    }
    public boolean exist(char[][] board, String word) {
        int rowMax = board.length;
        int colMax = board[0].length;
        boolean[][] flags = new boolean[rowMax][colMax];
        for (int i = 0; i < rowMax; i++) {
            for (int j = 0; j < colMax; j++) {
                if (board[i][j] == word.charAt(0)) {
                    if (dfs(board, flags, word, i, j, 1)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private boolean dfs(char[][] board, boolean[][] flags, String word, int row, int col, int index) {
        if (index == word.length()) {
            return true;
        }
        if (row >= board.length || row < 0) {
            return false;
        }
        if (col >= board[0].length || col < 0) {
            return false;
        }
        boolean result = false;
        if (!flags[row][col] && board[row][col] == word.charAt(index)) {
            flags[row][col] = true;
            result = dfs(board, flags, word, row + 1, col, index + 1) || dfs(board, flags, word, row, col + 1, index + 1) ||
                    dfs(board, flags, word, row - 1, col, index + 1) || dfs(board, flags, word, row, col - 1, index + 1);
            flags[row][col] = false;
        }
        return result;
    }
}
