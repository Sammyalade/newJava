package ioStream;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

import static java.lang.System.out;

public class Example8 {

    public static void main(String[] args) {
        try(OutputStreamWriter outputStreamWriter = new OutputStreamWriter(out);
                BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter)){
            bufferedWriter.write("I am the one");
        } catch(IOException ex){
                System.err.println(ex.getMessage());
        }
    }
}
