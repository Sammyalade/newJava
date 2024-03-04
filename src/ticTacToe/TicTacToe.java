package ticTacToe;

public class TicTacToe {

    private Positions[][] gameBoard;

    private boolean isPlayerTurn;

    public TicTacToe() {
        gameBoard = new Positions[][]{
                {Positions.EMPTY, Positions.EMPTY, Positions.EMPTY},
                {Positions.EMPTY, Positions.EMPTY, Positions.EMPTY},
                {Positions.EMPTY, Positions.EMPTY, Positions.EMPTY}
        };

        isPlayerTurn = true;

    }

    public void makeMove(int row, int column) {
        checkMove(row, column);

        if (gameBoard[row][column] == Positions.EMPTY) {
            if (isPlayerTurn) {
                gameBoard[row][column] = Positions.X;
            } else {
                gameBoard[row][column] = Positions.O;
            }
            isPlayerTurn = !isPlayerTurn;
        }
    }

    private void checkMove(int row, int column) {
        if (row < 0 || row > 2 || column < 0 || column > 2) {
            throw new RuntimeException("Invalid move. Rows or colum must not be less than 0 or greater than 2");
        }

        if (gameBoard[row][column] != Positions.EMPTY)
            throw new RuntimeException("Invalid move");
    }

    private boolean checkWinnerInRow() {
        for (int index = 0; index < 3; index++) {
            if (gameBoard[index][0] != Positions.EMPTY &&
                    gameBoard[index][0] == gameBoard[index][1] &&
                    gameBoard[index][1] == gameBoard[index][2]) {
                return true;
            }
        }
        return false;
    }

    private boolean checkWinnerInColumn() {
        for (int index = 0; index < 3; index++) {
            if (gameBoard[0][index] != Positions.EMPTY &&
                    gameBoard[0][index] == gameBoard[1][index] &&
                    gameBoard[index][1] == gameBoard[2][index]) {
                return true;
            }
        }
        return false;
    }

    private boolean checkWinnerDiagonalLeft() {
        return gameBoard[0][0] != Positions.EMPTY &&
                gameBoard[0][0] == gameBoard[1][1] &&
                gameBoard[1][1] == gameBoard[2][2];
    }

    private boolean checkWinnerDiagonalRight() {
        return gameBoard[0][2] != Positions.EMPTY &&
                gameBoard[0][2] == gameBoard[1][1] &&
                gameBoard[1][1] == gameBoard[2][0];
    }

    public boolean isDraw() {
        int emptyCount = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (gameBoard[i][j] == Positions.EMPTY) {
                    emptyCount++;
                }
            }
        }
        return emptyCount == 0;
    }
}