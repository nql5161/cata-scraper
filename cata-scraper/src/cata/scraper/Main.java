package cata.scraper;

//import com.google.gson.Gson;
//import com.google.gson.JsonObject;
//import com.google.gson.JsonParser;
import com.sun.org.apache.xpath.internal.operations.Bool;
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

    static ArrayList busChart = new ArrayList<XYChart.Series>();


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


        Connection jsonData = new Connection();
        System.out.println(jsonData.getData());
        //Bus[] buses = new Gson.fromJson(jsonData.getData(), Bus[].class);

        String time = "10am";
        stage.setTitle("CATA Bus Statistics");
        final CategoryAxis xAxis = new CategoryAxis();
        final NumberAxis yAxis = new NumberAxis();
        final BarChart<String,Number> bc = new BarChart<>(xAxis,yAxis);
        bc.setTitle("CATA Bus Rider Count");
        xAxis.setLabel("Bus Route");
        yAxis.setLabel("# of passengers");


        XYChart.Series blueLoop = new XYChart.Series();
        XYChart.Series whiteLoop = new XYChart.Series();
        XYChart.Series redLink = new XYChart.Series();
        XYChart.Series greenLink = new XYChart.Series();


        blueLoop.setName("Blue Loop");
        whiteLoop.setName("White Loop");
        redLink.setName("Red Link");
        greenLink.setName("Green Link");




        blueLoop.getData().add(new XYChart.Data(time, 50));
        whiteLoop.getData().add(new XYChart.Data(time, 55));
        redLink.getData().add(new XYChart.Data(time, 20));
        greenLink.getData().add(new XYChart.Data(time, 20));


        busChart.add(blueLoop);
        busChart.add(whiteLoop);
        busChart.add(redLink);
        busChart.add(greenLink);

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
        bc.getData().addAll(busChart);
        stage.setScene(scene);
        stage.show();
    }



    public static void main(String[] args) {
        //getConnection();
        //System.out.println(json);
        launch(args);
    }
}
