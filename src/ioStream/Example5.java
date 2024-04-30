package ioStream;

import java.io.FileReader;
import java.io.IOException;

public class Example5 {

    public static void main(String[] args){
        String fileLocation = "C:\\Users\\DELL\\IdeaProjects\\javaProjects\\src\\ioStream\\sample.txt";
        char[] fileChar = new char[1024];
        try(FileReader fileReader = new FileReader(fileLocation)){
            int length = fileReader.read(fileChar);
            displayFileContent(length, fileChar);
        }catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    private static void displayFileContent(int length, char[] fileChar) {
        for(int counter = 0; counter < length; counter++){
            System.out.print(Character.toString(fileChar[counter]));
        }
    }
}
