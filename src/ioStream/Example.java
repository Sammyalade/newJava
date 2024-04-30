package ioStream;

import java.io.IOException;
import java.io.PrintStream;

public class Example {

    public static void main(String[] args) {
        String fileLocation = "C:\\Users\\DELL\\IdeaProjects\\javaProjects\\src\\sample.txt";
        try(PrintStream out = new PrintStream(fileLocation)) {
            out.println("Hello World");
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
