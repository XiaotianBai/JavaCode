package com.Algorithm.LeetCode;

public class BattleshipsInABoard {
    public int countBattleships(char[][] board) {
        int count = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 'X') {
                    if (i == 0 && j == 0) count++;
                    else if (i == 0 && board[i][j - 1] == '.') count++;
                    else if (i != 0 && j == 0 && board[i - 1][j] == '.') count++;
                    else if (i != 0 && j != 0 && board[i][j - 1] == '.' && board[i - 1][j] == '.') count++;
                }
            }
        }
        return count;
    }
}
