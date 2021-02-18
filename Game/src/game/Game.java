/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
/*
 * @author lenovo
 */
public class Game extends Application {
    
    @Override
    public void start(Stage primaryStage) {
      
        
        
        NewGameBase root = new NewGameBase();
        root.setId("pane");
        
        
       Scene scene = new Scene(root, 806, 580);
        
   String css = this.getClass().getResource("mycss.css").toExternalForm();
  // scene.getStylesheets().addAll(this.getClass().getResource("mycss.css").toExternalForm());
        scene.getStylesheets().add(css);
       root.getStyleClass().add("root");
   
        primaryStage.setTitle("TicTacToe");
        primaryStage.setScene(scene);
      //  primaryStage.initStyle(StageStyle.TRANSPARENT);
        primaryStage.setResizable(false);
        primaryStage.show();
       
        
        
    }
    

    
//
//    public static void main(String[] args) {
//        launch(args);
//    }
//


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
