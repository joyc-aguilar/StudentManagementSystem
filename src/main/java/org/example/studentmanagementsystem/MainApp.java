package org.example.studentmanagementsystem;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApp extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        // Ensure this string matches the exact name of your FXML file in /resources
        FXMLLoader fxmlLoader = new FXMLLoader(MainApp.class.getResource("/org/example/studentmanagementsystem/hello-view.fxml"));

        Scene scene = new Scene(fxmlLoader.load(), 600, 400);

        stage.setTitle("Student Management System");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}