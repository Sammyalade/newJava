package turtleGraphicsTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import turtleGraphics.Direction;
import turtleGraphics.Position;
import turtleGraphics.SketchPad;
import turtleGraphics.TurtleGraphics;

import static org.junit.jupiter.api.Assertions.*;

public class TurtleGraphicsTest {

    private TurtleGraphics ijapa;
    private SketchPad sketchPad;

    @BeforeEach
    public void setUp(){
        sketchPad = new SketchPad(5, 5);
        ijapa = new TurtleGraphics(sketchPad);
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
    public void testThatTurtleIsInStartPosition(){
        assertEquals(new Position(0,0), ijapa.currentPosition());
    }

    @Test
    public void testThatTurtleCanMoveForwardEastwards(){
        assertTrue(ijapa.isPenUp());
        assertEquals(Direction.EAST, ijapa.checkCurrentDirection());
        assertEquals(new Position(0,0), ijapa.currentPosition());
        ijapa.moveForward(5);
        assertEquals(new Position(0, 4), ijapa.currentPosition());
    }

    @Test
    public void testThatTurtleCanMoveForwardSouthwards(){
        assertTrue(ijapa.isPenUp());
        ijapa.turnRight();
        assertEquals(Direction.SOUTH, ijapa.checkCurrentDirection());
        assertEquals(new Position(0,0), ijapa.currentPosition());
        ijapa.moveForward(5);
        assertEquals(new Position(4, 0), ijapa.currentPosition());
    }

    @Test
    public void testThatTurtleCanMoveForwardNorthward(){
        assertTrue(ijapa.isPenUp());
        ijapa.turnRight();
        assertEquals(Direction.SOUTH, ijapa.checkCurrentDirection());
        assertEquals(new Position(0,0), ijapa.currentPosition());
        ijapa.moveForward(5);
        assertEquals(new Position(4, 0), ijapa.currentPosition());
        ijapa.turnRight();
        ijapa.turnRight();
        assertEquals(Direction.NORTH, ijapa.checkCurrentDirection());
        ijapa.moveForward(5);
        assertEquals(new Position(0, 0), ijapa.currentPosition());
    }

    @Test
    public void testThatWhenPenIsDown_turtleMovesAndWrites1(){
        ijapa.penDown();
        assertFalse(ijapa.isPenUp());
        assertEquals(Direction.EAST, ijapa.checkCurrentDirection());
        ijapa.moveForward(2);
        assertEquals(1, sketchPad.getSketchPad(0,0));

    }

}
