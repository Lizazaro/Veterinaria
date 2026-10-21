package com.mycompany.ruletgrupos;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * JavaFX RuletaGrupos
 */
public class RuletaGrupos extends Application {

    @Override
    public void start(Stage stage) throws IOException {
         
        FXMLLoader loader = new FXMLLoader(
                RuletaGrupos.class.getResource("/Vista.fxml")
        );

        Parent root = loader.load();
        Scene scene = new Scene(root);

        stage.setTitle("Ruleta de grupos");
        stage.setScene(scene);
        stage.show();
        
        
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}