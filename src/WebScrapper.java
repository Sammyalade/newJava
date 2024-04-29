import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class WebScrapper {

    public static void main(String[] args) {
        //https://www.google.com/search?client=firefox-b-d&q=john+doe
        //scheme --> https
        //domain name --> www.google.com
        //path --> /search?client=firefox-b-d&q=john+doe

        String location = "https://www.google.com";
        try {
            URL url = new URL(location);
            InputStream inputStream = url.openStream();

            byte[] bytes = inputStream.readAllBytes();

            for (byte element : bytes) {
                System.out.print(Character.toString(element));
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
