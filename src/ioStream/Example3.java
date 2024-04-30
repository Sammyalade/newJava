package ioStream;

import java.io.*;

public class Example3 {

    public static void main(String[] args) throws FileNotFoundException {
        String fileLocation = "C:\\Users\\DELL\\IdeaProjects\\javaProjects\\src\\ioStream\\sample2.txt";
        try(var inputStream = new FileInputStream(fileLocation);
            var dataInputStream = new DataInputStream(inputStream);) {
            byte[] fileData = dataInputStream.readAllBytes();
            System.out.println(new String(fileData));
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
