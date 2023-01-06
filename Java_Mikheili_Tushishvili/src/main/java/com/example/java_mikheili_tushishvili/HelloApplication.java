package com.example.java_mikheili_tushishvili;

import javafx.application.Application;
import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {


    @Override
    public void start(Stage stage) throws IOException {

        PieChart pieChart = new PieChart();
        pieChart.setTranslateX(70);
        pieChart.setTranslateY(100);

        pieChart.setData(getData());

        Group root = new Group();
        root.getChildren().add(pieChart);


        Scene scene = new Scene(root,600,600, Color.GREEN);
        stage.setTitle("Flights");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

    private ObservableList<PieChart.Data>getData(){
        ObservableList<PieChart.Data> observableList = FXCollections.observableArrayList(
                new PieChart.Data("Georgia",2),
                new PieChart.Data("Germany",3),
                new PieChart.Data("Italy",4)
        );
        return observableList;
    }
}