package ioStream;

import java.io.*;
import java.util.stream.Collectors;

public class Example6 {

    public static void main(String[] args) {
        String fileLocation = "C:\\Users\\DELL\\IdeaProjects\\javaProjects\\src\\ioStream\\sample.txt";
        try(FileInputStream fileInputStream = new FileInputStream(fileLocation);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader)){
            System.out.println(bufferedReader.lines().collect(Collectors.joining("\n")));
        } catch(IOException ex){
                System.err.println(ex.getMessage());
        }
    }
}
