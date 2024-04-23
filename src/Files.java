import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.Files.createFile;

public class Files {


    public static void main(String[] args) {
        try{
            Path path = Paths.get("C:\\Users\\DELL\\Desktop\\WPS\\sampleText");
            createFile(path);
            System.out.println("Successful");
        } catch (IOException e){
            e.printStackTrace();
            System.out.println("Failed");
        }
    }
}
