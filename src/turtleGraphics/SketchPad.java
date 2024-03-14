package turtleGraphics;

public class SketchPad {
    private int[][] sketchPad;
    public SketchPad(int row, int column) {
        sketchPad = new int[row][column];
    }

    public int getSketchPad(int row, int column) {
        return sketchPad[row][column];
    }

    public void write() {
    }
}
