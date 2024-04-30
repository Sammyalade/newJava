package ioStream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

public class Example7 {

    public static void main(String[] args) {
        try(InputStreamReader inputStreamReader = new InputStreamReader(in);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader)){
            System.out.println("Enter your data: ");
            System.out.println("You entered: " +bufferedReader.readLine());
        } catch(IOException ex){
                System.err.println(ex.getMessage());
        }
    }
}
