package ioStream;

import java.io.*;

public class Example4 {

    public static void main(String[] args) throws FileNotFoundException {
        String fileLocation = "C:\\Users\\DELL\\IdeaProjects\\javaProjects\\src\\ioStream\\sample2.txt";
        try(FileOutputStream fileOutputStream = new FileOutputStream(fileLocation)){
            fileOutputStream.write("\nInvest your money wisely, don't buy bone-straight\n".getBytes());
        } catch (IOException exception){
            System.err.println(exception.getMessage());
        }
    }
}
