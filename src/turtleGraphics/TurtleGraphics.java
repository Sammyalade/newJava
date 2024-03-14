package turtleGraphics;

public class TurtleGraphics {

    private Direction direction = Direction.EAST;

    private boolean isPenUp = true;
    public boolean isPenUp() {
        return isPenUp;
    }

    public void penDown() {
        isPenUp = false;
    }

    public void penUp() {
        isPenUp = true;
    }



    public Direction checkCurrentDirection() {
        return direction;
    }

    public void turnLeft() {
        direction = Direction.valueOf(direction.turnLeft());
    }

    public void turnRight() {
        direction = Direction.valueOf(direction.turnRight());
    }
}
