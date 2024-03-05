package ticTacToeTest;

import org.junit.Test;
import ticTacToe.TicTacToe;

public class TicTacToeTest {

    @Test
    public void testThatUserCanMakeAMove(){
        TicTacToe ticTacToe = new TicTacToe();
        ticTacToe.makeMove(2, 1);
    }
}
