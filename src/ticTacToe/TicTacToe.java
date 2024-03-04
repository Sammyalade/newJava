package ticTacToe;

public class TicTacToe {

    private Positions[][] gameBoard;

    private boolean isPlayerTurn;

    public TicTacToe() {
        gameBoard = new Positions[][]{
                {Positions.valueOf(" "), Positions.valueOf(" "), Positions.valueOf(" ")},
                {Positions.valueOf(" "), Positions.valueOf(" "), Positions.valueOf(" ")},
                {Positions.valueOf(" "), Positions.valueOf(" "), Positions.valueOf(" ")}
        };

        isPlayerTurn = true;

    }

    public void makeMove(int row, int column) {
        do{
            checkMove(row, column);
            if (gameBoard[row][column] == Positions.valueOf(Positions.EMPTY.getSpace())) {
                if (isPlayerTurn) {
                    gameBoard[row][column] = Positions.X;
                } else {
                    gameBoard[row][column] = Positions.O;
                }
                isPlayerTurn = !isPlayerTurn;
            }
        } while(!checkWinner());
    }

    private void checkMove(int row, int column) {
        if (row < 0 || row > 2 || column < 0 || column > 2) {
            throw new RuntimeException("Invalid move. Rows or colum must not be less than 0 or greater than 2");
        }

        if (gameBoard[row][column] != Positions.valueOf(Positions.EMPTY.getSpace()))
            throw new RuntimeException("Invalid move");
    }
    public boolean checkWinner(){
        return checkWinnerDiagonalLeft()
                || checkWinnerInRow()
                || checkWinnerInColumn()
                || checkWinnerDiagonalRight();
    }

    public boolean checkWinnerInRow() {
        for (int index = 0; index < 3; index++) {
            if (gameBoard[index][0] != Positions.valueOf(Positions.EMPTY.getSpace()) &&
                    gameBoard[index][0] == gameBoard[index][1] &&
                    gameBoard[index][1] == gameBoard[index][2]) {
                return true;
            }
        }
        return false;
    }

    public boolean checkWinnerInColumn() {
        for (int index = 0; index < 3; index++) {
            if (gameBoard[0][index] != Positions.valueOf(Positions.EMPTY.getSpace()) &&
                    gameBoard[0][index] == gameBoard[1][index] &&
                    gameBoard[index][1] == gameBoard[2][index]) {
                return true;
            }
        }
        return false;
    }

    public boolean checkWinnerDiagonalLeft() {
        return gameBoard[0][0] != Positions.valueOf(Positions.EMPTY.getSpace()) &&
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
        for (int index1 = 0; index1 < 3; index1++) {
            for (int index2 = 0; index2 < 3; index2++) {
                if (gameBoard[index1][index2] == Positions.valueOf(Positions.EMPTY.getSpace())) {
                    emptyCount++;
                }
            }
        }
        return emptyCount == 0;
    }

    public void displayGame(){
        System.out.println("________________");
        for (int index1 = 0; index1 < 3; index1++){
            for(int index2 = 0; index2 < 3; index2++){
                System.out.print(gameBoard[index1][index2] + "   ");
            }
            System.out.println();
            System.out.println("________________");
        }
    }
}