package ioStream;

import java.io.IOException;
import java.io.PrintStream;

public class Example2 {

    public static void main(String[] args) {
        String fileLocation = "C:\\Users\\DELL\\IdeaProjects\\javaProjects\\src\\ioStream\\sample2.txt";
        try(PrintStream out = new PrintStream(fileLocation)) {
            System.setOut(out);
            System.out.println("Dayo sent it to the group");
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
