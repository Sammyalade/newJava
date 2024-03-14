package turtleGraphics;

public class TurtleGraphics {

    private Direction direction = Direction.EAST;
    private Position position = new Position(0, 0);
    private SketchPad sketchPad;

    public TurtleGraphics(SketchPad sketchPad){
        this.sketchPad = sketchPad;
    }

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

    public void moveForward(int numberOfMovement) {
        if (!isPenUp){
            sketchPad.write();
        }
        switch(checkCurrentDirection()){
            case EAST -> performMovementEastward(numberOfMovement);
            case SOUTH -> performMovementSouthwards(numberOfMovement);
            case NORTH -> performMovementNorthward(numberOfMovement);
        }
    }

    private void performMovementNorthward(int numberOfMovement) {
        position.setRow(position.getRow()-(numberOfMovement-1));
    }

    private void performMovementSouthwards(int numberOfMovement) {
        position.setRow(position.getRow()+numberOfMovement-1);
    }

    private void performMovementEastward(int numberOfMovement) {
        position.setColumn(position.getColumn()+numberOfMovement-1);
    }

    public Position currentPosition() {
        return position;
    }
}
