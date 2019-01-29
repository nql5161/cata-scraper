package cata.scraper;

//import com.google.gson.Gson;
//import com.google.gson.JsonObject;
//import com.google.gson.JsonParser;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

public class Main extends Application {

    final static String blueLoop = "Blue Loop";
    final static String whiteLoop = "White Loop";
    static ArrayList buses = new ArrayList<XYChart.Series>();
    private static String json;

    public static String getConnection() {
        String link = "https://realtime.catabus.com/InfoPoint/rest/Routes/GetAllRoutes";
        try {
            URL url = new URL(link);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            int responseCode = connection.getResponseCode();
            if (responseCode == 200){
                System.out.println("Connection is successful!");
            }
            try(BufferedReader br = new BufferedReader
                    (new InputStreamReader(connection.getInputStream()))){
                String input;
                StringBuffer response = new StringBuffer();
                while((input = br.readLine()) != null){
                    response.append(input);
                }

                json = String.valueOf(response);
//                System.out.println(response.toString());
//                System.out.println(json);
//                scraper(json);
            } catch (IOException e){
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return json;
    }
//
//    public static void scraper(String json){
//        Gson gson = new Gson();
//        Bus[] data = gson.fromJson(json, Bus[].class);
//        JsonParser parser = new JsonParser();
//        JsonObject element = (JsonObject)parser.parse(json);
//        System.out.println(element.toString());
//        System.out.println(data.toString());
//    }

    @Override
    public void start(Stage stage) throws Exception{
//        Parent root = FXMLLoader.load(getClass().getResource("catascraper.fxml"));
        String time = "10am";
        stage.setTitle("CATA Bus Statistics");
        final CategoryAxis xAxis = new CategoryAxis();
        final NumberAxis yAxis = new NumberAxis();
        final BarChart<String,Number> bc = new BarChart<>(xAxis,yAxis);
        bc.setTitle("CATA Bus Rider Count");
        xAxis.setLabel("Bus Route");
        yAxis.setLabel("# of passengers");
        XYChart.Series bus1 = new XYChart.Series();
        XYChart.Series bus2 = new XYChart.Series();
        XYChart.Series bus3 = new XYChart.Series();
        bus1.setName("Blue Loop");
        bus2.setName("White Loop");
        bus3.setName("Red Link");
        bus1.getData().add(new XYChart.Data(time, 50));
        bus2.getData().add(new XYChart.Data(time, 55));
        bus3.getData().add(new XYChart.Data(time, 20));
        buses.add(bus1);
        buses.add(bus2);
        buses.add(bus3);
//        for(int i = 0; i < passengerCount.length; i++){
//            for (int j = 0; j < buses.toArray().length; j++){
//                bus = new XYChart.Series();
//                buses.add(bus);
//                bus[i] = bus.getData().add(new XYChart.Data(passengerCount[i]));
//            }
//        }
//        for(XYChart.Series bus : buses){
//
//        }
        Timeline tl = new Timeline();
        tl.getKeyFrames().add(new KeyFrame(Duration.millis(2000),
                (ActionEvent actionEvent) -> {
                    bc.getData().stream().forEach((series) -> {
                        series.getData().stream().forEach((data) -> {
                            data.setYValue(Math.random() * 60);
                        });
                    });
                }
        ));
        tl.setCycleCount(Animation.INDEFINITE);
        tl.setAutoReverse(true);
        tl.play();
        Scene scene = new Scene(bc, 800,600);
        bc.getData().addAll(buses);
        stage.setScene(scene);
        stage.show();
    }



    public static void main(String[] args) {
        getConnection();
        System.out.println(json);
        launch(args);
    }
}