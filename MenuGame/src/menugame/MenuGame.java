/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menugame;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author lenovo
 */
public class MenuGame extends Application {
    
    @Override
    public void start(Stage primaryStage) {
              
        MenuBase root = new MenuBase();
        root.setId("pane");
       Scene scene = new Scene(root,  806, 580);
        
   String css = this.getClass().getResource("menu.css").toExternalForm();
  // scene.getStylesheets().addAll(this.getClass().getResource("mycss.css").toExternalForm());
        scene.getStylesheets().add(css);
       root.getStyleClass().add("root");
     
   
        primaryStage.setTitle("MainMenu");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
