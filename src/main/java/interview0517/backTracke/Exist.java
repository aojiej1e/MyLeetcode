package interview0517.backTracke;

/**
 * @author aojie
 * @Function
 * @create 2024-06-05 16:48
 */
public class Exist {
    public boolean exist(char[][] board, String word) {
        int rowMax = board.length;
        int colMax = board[0].length;
        for (int i = 0; i < rowMax; i++) {
            for (int j = 0; j < colMax; j++) {
                if (board[i][j] == word.charAt(0)) {
                    if (dfs(board, word, i, j, rowMax, colMax, 0, new boolean[rowMax][colMax])) {
                        return true;
                    }
                }
            }
        }
        return false;

    }

    private boolean dfs(char[][] board, String word, int i, int j, int rowMax, int colMax, int index, boolean[][] flag) {
        if (index == word.length()) {
            return true;
        }
        if (i < 0 || i >= rowMax || j < 0 || j >= colMax) {
            return false;
        }
        if (board[i][j] == word.charAt(index) && !flag[i][j]) {
            flag[i][j] = true;
            boolean b = dfs(board, word, i - 1, j, rowMax, colMax, index + 1, flag) ||
                    dfs(board, word, i + 1, j, rowMax, colMax, index + 1, flag) ||
                    dfs(board, word, i, j - 1, rowMax, colMax, index + 1, flag) ||
                    dfs(board, word, i, j + 1, rowMax, colMax, index + 1, flag);
            flag[i][j] = false;
            return b;
        }
        return false;
    }
}
