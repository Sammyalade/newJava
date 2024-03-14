package turtleGraphicsTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import turtleGraphics.Direction;
import turtleGraphics.TurtleGraphics;

import static org.junit.jupiter.api.Assertions.*;

public class TurtleGraphicsTest {

    private TurtleGraphics ijapa;

    @BeforeEach
    public void setUp(){
        ijapa = new TurtleGraphics();
    }
    @Test
    public void testIsPenUp(){
         assertTrue(ijapa.isPenUp());
    }

    @Test
    public void testThatTurtleCanPenDown(){
        ijapa.penDown();
        assertFalse(ijapa.isPenUp());
    }

    @Test
    public void testThatTurtleCanPenDownAndPenUpAgain(){
        ijapa.penDown();
        assertFalse(ijapa.isPenUp());
        ijapa.penUp();
        assertTrue(ijapa.isPenUp());
    }

    @Test
    public void testThatTurtleCanTurnLeft(){
        ijapa.turnLeft();
        assertSame(Direction.NORTH, ijapa.checkCurrentDirection());
    }

    @Test
    public void testThatTurtleCanTurnLeftTwice(){
        ijapa.turnLeft();
        ijapa.turnLeft();
        assertSame(Direction.WEST, ijapa.checkCurrentDirection());
    }

    @Test
    public void testThatTurtleCanTurnLeftThrice(){
        ijapa.turnLeft();
        ijapa.turnLeft();
        ijapa.turnLeft();
        assertSame(Direction.SOUTH, ijapa.checkCurrentDirection());
    }

    @Test
    public void testThatTurtleCanTurnLeftFourTimes(){
        ijapa.turnLeft();
        ijapa.turnLeft();
        ijapa.turnLeft();
        ijapa.turnLeft();
        assertSame(Direction.EAST, ijapa.checkCurrentDirection());
    }

    @Test
    public void turtleCanTurnRight(){
        ijapa.turnRight();
        assertSame(Direction.SOUTH, ijapa.checkCurrentDirection());
    }

    @Test
    public void turtleCanTurnRightTwice(){
        ijapa.turnRight();
        ijapa.turnRight();
        assertSame(Direction.WEST, ijapa.checkCurrentDirection());
    }

    @Test
    public void turtleCanTurnRightThrice(){
        ijapa.turnRight();
        ijapa.turnRight();
        ijapa.turnRight();
        assertSame(Direction.NORTH, ijapa.checkCurrentDirection());
    }

    @Test
    public void turtleCanTurnRightFourTimes(){
        ijapa.turnRight();
        ijapa.turnRight();
        ijapa.turnRight();
        ijapa.turnRight();
        assertSame(Direction.EAST, ijapa.checkCurrentDirection());
    }

    @Test
    public void testThatTurtleCanMoveForward(){
        ijapa.moveForward(0, 0);

    }
}
