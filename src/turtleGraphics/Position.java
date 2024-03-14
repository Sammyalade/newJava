package turtleGraphics;

public class Position {

    private int row;
    private int column;
    public Position(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public boolean equals(Object e){
        if(e instanceof Position position){
            return row == position.row && column == position.column;
        }
        return false;
    }


}
