package com.example.bingoboard;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class BingoApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        //The following code creates the instance of the application specified in the fxml and controller file. Runs through classes in controller file.
        FXMLLoader fxmlLoader = new FXMLLoader(BingoApplication.class.getResource("Bingo.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 5000, 5000);
        stage.setTitle("Bingo Game");
        stage.setScene(scene);
        stage.show();
    }

    //Launches controller code and fxml file
    public static void main(String[] args) {
        launch();
    }
}