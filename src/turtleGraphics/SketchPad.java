package turtleGraphics;

import java.util.Arrays;

public class SketchPad {
    private int[][] sketchPad;
    public SketchPad(int row, int column) {
        sketchPad = new int[row][column];
    }

    public int getSketchPad(int row, int column) {
        return sketchPad[row][column];
    }

    public String toString(){
        return String.format(Arrays.deepToString(sketchPad));
    }

    public void write(int row, int column) {
        sketchPad[row][column] = 1;
    }
}
