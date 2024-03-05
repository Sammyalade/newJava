package ticTacToeTest;

import ticTacToe.TicTacToe;

import java.util.Scanner;

public class TicTacToeTest {
    public static void main(String[] args) {
        Scanner collector = new Scanner(System.in);
        TicTacToe ticTacToe = new TicTacToe();
        do{
            System.out.println("Enter row: ");
            int row = collector.nextInt();
            System.out.println("Enter column: ");
            int column = collector.nextInt();
            ticTacToe.makeMove(row, column);
        } while(ticTacToe.checkWinner() || ticTacToe.isDraw());
    }
}
