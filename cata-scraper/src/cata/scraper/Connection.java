package cata.scraper;

//import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Connection {

    public String getData() {
        String link = "https://realtime.catabus.com/InfoPoint/rest/Routes/GetAllRoutes";
        try {
            URL url = new URL(link);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            int responseCode = connection.getResponseCode();
            if (responseCode == 200){
                System.out.println("Connection is successful!");
                try(BufferedReader br = new BufferedReader
                        (new InputStreamReader(connection.getInputStream()))){
                    String input;
                    String json = "";
                    StringBuffer response = new StringBuffer();
                    while((input = br.readLine()) != null){
                        json = input;
                    }
                    return json;
                }
                catch (IOException e){
                    e.printStackTrace();
                }
            }
            else {
                System.out.println("Connection failed, try again.");
            }

        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return "meh";
    }
}
