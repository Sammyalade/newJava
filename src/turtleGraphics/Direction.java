package turtleGraphics;

public enum Direction {

    EAST("NORTH", "SOUTH"),
    NORTH("WEST", "EAST"),
    WEST("SOUTH", "NORTH"),
    SOUTH("EAST", "WEST");

    private final String left;
    private final String right;

    Direction(String left, String right){
        this.left = left;
        this.right = right;
    }

    public String turnLeft(){
        return left;
    }

    public String turnRight(){
        return right;
    }

}
