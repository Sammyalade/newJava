package ticTacToe;

public enum Positions {

    X,
    O,
    EMPTY(" ");

    private final String space;

    Positions(String space) {
        this.space = space;
    }

    public String getSpace(){
        return space;
    }
}
