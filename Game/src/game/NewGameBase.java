package game;

import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.effect.Glow;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.text.Text;    

public class NewGameBase extends BorderPane {

    protected final Pane pane;
    protected final GridPane gridPane;
    protected final ColumnConstraints columnConstraints;
    protected final ColumnConstraints columnConstraints0;
    protected final ColumnConstraints columnConstraints1;
    protected final RowConstraints rowConstraints;
    protected final RowConstraints rowConstraints0;
    protected final RowConstraints rowConstraints1;
    protected final Button button;
    protected final Button button0;
    protected final Button button1;
    protected final Button button2;
    protected final Button button3;
    protected final Button button4;
    protected final Button button5;
    protected final Button button6;
    protected final Button button7;
    protected final Button button8;
    protected final Button button9;
    protected final Text text;
    protected final Text text0;
    protected final Text text1;
    protected final Text text2;
    protected final Text text3;
    protected final Text text4;
    protected final Text text5;
    protected final Text text6;
    protected final Text text7;
    protected final Text text8;

     int i = 0 ;
    String myarr[]={"X","O"};
    
    public NewGameBase() {

        pane = new Pane();
        gridPane = new GridPane();
        columnConstraints = new ColumnConstraints();
        columnConstraints0 = new ColumnConstraints();
        columnConstraints1 = new ColumnConstraints();
        rowConstraints = new RowConstraints();
        rowConstraints0 = new RowConstraints();
        rowConstraints1 = new RowConstraints();
        button = new Button();
        button0 = new Button();
        button1 = new Button();
        button2 = new Button();
        button3 = new Button();
        button4 = new Button();
        button5 = new Button();
        button6 = new Button();
        button7 = new Button();
        button8 = new Button();
        button9 = new Button();
        text = new Text();
        text0 = new Text();
        text1 = new Text();
        text2 = new Text();
        text3 = new Text();
        text4 = new Text();
        text5 = new Text();
        text6 = new Text();
        text7 = new Text();
        text8 = new Text();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(600.0);
        setPrefWidth(800.0);

        BorderPane.setAlignment(pane, javafx.geometry.Pos.CENTER);
        pane.setId("pane");
        pane.setMaxHeight(USE_PREF_SIZE);
        pane.setMaxWidth(USE_PREF_SIZE);
        pane.setMinHeight(USE_PREF_SIZE);
        pane.setMinWidth(USE_PREF_SIZE);
        pane.setPrefHeight(603.0);
        pane.setPrefWidth(806.0);
        pane.getStylesheets().add("/game/mycss.css");

        gridPane.setAlignment(javafx.geometry.Pos.CENTER);
        gridPane.setLayoutX(201.0);
        gridPane.setLayoutY(107.0);
        gridPane.setMinHeight(USE_PREF_SIZE);
        gridPane.setMinWidth(USE_PREF_SIZE);
        gridPane.setPrefHeight(386.0);
        gridPane.setPrefWidth(398.0);

        columnConstraints.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints.setMinWidth(10.0);
        columnConstraints.setPrefWidth(100.0);

        columnConstraints0.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints0.setMinWidth(10.0);
        columnConstraints0.setPrefWidth(100.0);

        columnConstraints1.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints1.setMinWidth(10.0);
        columnConstraints1.setPrefWidth(100.0);

        rowConstraints.setMinHeight(10.0);
        rowConstraints.setPrefHeight(30.0);
        rowConstraints.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints0.setMinHeight(10.0);
        rowConstraints0.setPrefHeight(30.0);
        rowConstraints0.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints1.setMinHeight(10.0);
        rowConstraints1.setPrefHeight(30.0);
        rowConstraints1.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        button.setAlignment(javafx.geometry.Pos.CENTER);
        button.setContentDisplay(javafx.scene.control.ContentDisplay.CENTER);
        button.setId("Button");
        button.setMaxHeight(Double.MAX_VALUE);
        button.setMaxWidth(Double.MAX_VALUE);
        button.setMnemonicParsing(false);
        button.setPrefHeight(94.0);
        button.setPrefWidth(107.0);
        button.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        GridPane.setMargin(button, new Insets(5.0));
        button.setPadding(new Insets(10.0, 0.0, 0.0, 0.0));

        GridPane.setColumnIndex(button0, 1);
        button0.setAlignment(javafx.geometry.Pos.CENTER);
        button0.setContentDisplay(javafx.scene.control.ContentDisplay.CENTER);
        button0.setId("Button");
        button0.setMaxHeight(Double.MAX_VALUE);
        button0.setMaxWidth(Double.MAX_VALUE);
        button0.setMnemonicParsing(false);
        button0.setPrefHeight(94.0);
        button0.setPrefWidth(107.0);
        button0.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        GridPane.setMargin(button0, new Insets(5.0));

        GridPane.setColumnIndex(button1, 2);
        button1.setAlignment(javafx.geometry.Pos.CENTER);
        button1.setContentDisplay(javafx.scene.control.ContentDisplay.CENTER);
        button1.setId("Button");
        button1.setMaxHeight(Double.MAX_VALUE);
        button1.setMaxWidth(Double.MAX_VALUE);
        button1.setMnemonicParsing(false);
        button1.setPrefHeight(142.0);
        button1.setPrefWidth(143.0);
        button1.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        GridPane.setMargin(button1, new Insets(5.0));

        GridPane.setRowIndex(button2, 1);
        button2.setAlignment(javafx.geometry.Pos.CENTER);
        button2.setContentDisplay(javafx.scene.control.ContentDisplay.CENTER);
        button2.setId("Button");
        button2.setMaxHeight(Double.MAX_VALUE);
        button2.setMaxWidth(Double.MAX_VALUE);
        button2.setMnemonicParsing(false);
        button2.setPrefHeight(94.0);
        button2.setPrefWidth(107.0);
        button2.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        GridPane.setMargin(button2, new Insets(5.0));

        GridPane.setColumnIndex(button3, 1);
        GridPane.setRowIndex(button3, 1);
        button3.setAlignment(javafx.geometry.Pos.CENTER);
        button3.setContentDisplay(javafx.scene.control.ContentDisplay.CENTER);
        button3.setId("Button");
        button3.setMaxHeight(Double.MAX_VALUE);
        button3.setMaxWidth(Double.MAX_VALUE);
        button3.setMnemonicParsing(false);
        button3.setPrefHeight(94.0);
        button3.setPrefWidth(107.0);
        button3.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        GridPane.setMargin(button3, new Insets(5.0));
        button3.setPadding(new Insets(5.0));

        GridPane.setColumnIndex(button4, 2);
        GridPane.setRowIndex(button4, 1);
        button4.setAlignment(javafx.geometry.Pos.CENTER);
        button4.setContentDisplay(javafx.scene.control.ContentDisplay.CENTER);
        button4.setId("Button");
        button4.setMaxHeight(Double.MAX_VALUE);
        button4.setMaxWidth(Double.MAX_VALUE);
        button4.setMnemonicParsing(false);
        button4.setPrefHeight(94.0);
        button4.setPrefWidth(107.0);
        button4.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        GridPane.setMargin(button4, new Insets(5.0));

        GridPane.setRowIndex(button5, 2);
        button5.setAlignment(javafx.geometry.Pos.CENTER);
        button5.setContentDisplay(javafx.scene.control.ContentDisplay.CENTER);
        button5.setId("Button");
        button5.setMaxHeight(Double.MAX_VALUE);
        button5.setMaxWidth(Double.MAX_VALUE);
        button5.setMnemonicParsing(false);
        button5.setPrefHeight(94.0);
        button5.setPrefWidth(107.0);
        button5.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        GridPane.setMargin(button5, new Insets(5.0));

        GridPane.setColumnIndex(button6, 1);
        GridPane.setRowIndex(button6, 2);
        button6.setAlignment(javafx.geometry.Pos.CENTER);
        button6.setContentDisplay(javafx.scene.control.ContentDisplay.CENTER);
        button6.setId("Button");
        button6.setMaxHeight(Double.MAX_VALUE);
        button6.setMaxWidth(Double.MAX_VALUE);
        button6.setMnemonicParsing(false);
        button6.setPrefHeight(94.0);
        button6.setPrefWidth(107.0);
        button6.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        GridPane.setMargin(button6, new Insets(5.0));

        GridPane.setColumnIndex(button7, 2);
        GridPane.setRowIndex(button7, 2);
        button7.setAlignment(javafx.geometry.Pos.CENTER);
        button7.setContentDisplay(javafx.scene.control.ContentDisplay.CENTER);
        button7.setId("Button");
        button7.setMaxHeight(Double.MAX_VALUE);
        button7.setMaxWidth(Double.MAX_VALUE);
        button7.setMnemonicParsing(false);
        button7.setPrefHeight(94.0);
        button7.setPrefWidth(107.0);
        button7.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        GridPane.setMargin(button7, new Insets(5.0));

        button8.setAlignment(javafx.geometry.Pos.BASELINE_CENTER);
        button8.setId("resback");
        button8.setLayoutX(649.0);
        button8.setLayoutY(518.0);
        button8.setMnemonicParsing(false);
        button8.setPrefHeight(50.0);
        button8.setPrefWidth(140.0);
        button8.setText("Restart");
        button8.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);

        button9.setAlignment(javafx.geometry.Pos.CENTER);
        button9.setContentDisplay(javafx.scene.control.ContentDisplay.CENTER);
        button9.setId("resback");
        button9.setLayoutX(15.0);
        button9.setLayoutY(525.0);
        button9.setMaxHeight(USE_PREF_SIZE);
        button9.setMaxWidth(USE_PREF_SIZE);
        button9.setMinHeight(USE_PREF_SIZE);
        button9.setMinWidth(USE_PREF_SIZE);
        button9.setMnemonicParsing(false);
        button9.setPrefHeight(50.0);
        button9.setPrefWidth(110.0);
        button9.setText("Back");
        button9.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);

        text.setLayoutX(355.0);
        text.setLayoutY(49.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("X");
        text.setWrappingWidth(11.4000244140625);

        text0.setId("pane");
        text0.setLayoutX(19.0);
        text0.setLayoutY(135.0);
        text0.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text0.setStrokeWidth(0.0);
        text0.setText("Player X");

        text1.setLayoutX(59.0);
        text1.setLayoutY(170.0);
        text1.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text1.setStrokeWidth(0.0);
        text1.setText("xxx");

        text2.setLayoutX(14.0);
        text2.setLayoutY(210.0);
        text2.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text2.setStrokeWidth(0.0);
        text2.setText("Score:");

        text3.setLayoutX(136.0);
        text3.setLayoutY(210.0);
        text3.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text3.setStrokeWidth(0.0);
        text3.setText("0");

        text4.setLayoutX(645.0);
        text4.setLayoutY(135.0);
        text4.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text4.setStrokeWidth(0.0);
        text4.setText("Player O");

        text5.setLayoutX(695.0);
        text5.setLayoutY(170.0);
        text5.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text5.setStrokeWidth(0.0);
        text5.setText("ooo");

        text6.setLayoutX(639.0);
        text6.setLayoutY(210.0);
        text6.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text6.setStrokeWidth(0.0);
        text6.setText("Score:");

        text7.setLayoutX(764.0);
        text7.setLayoutY(210.0);
        text7.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text7.setStrokeWidth(0.0);
        text7.setText("0");

        text8.setLayoutX(393.0);
        text8.setLayoutY(49.0);
        text8.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text8.setStrokeWidth(0.0);
        text8.setText("Turn");
        pane.setPadding(new Insets(10.0, 10.0, 0.0, 100.0));
        setTop(pane);

        gridPane.getColumnConstraints().add(columnConstraints);
        gridPane.getColumnConstraints().add(columnConstraints0);
        gridPane.getColumnConstraints().add(columnConstraints1);
        gridPane.getRowConstraints().add(rowConstraints);
        gridPane.getRowConstraints().add(rowConstraints0);
        gridPane.getRowConstraints().add(rowConstraints1);
        gridPane.getChildren().add(button);
        gridPane.getChildren().add(button0);
        gridPane.getChildren().add(button1);
        gridPane.getChildren().add(button2);
        gridPane.getChildren().add(button3);
        gridPane.getChildren().add(button4);
        gridPane.getChildren().add(button5);
        gridPane.getChildren().add(button6);
        gridPane.getChildren().add(button7);
        
         gridPane.getChildren().forEach(item->{
        item.setOnMouseClicked(new EventHandler<MouseEvent>(){
        @Override
        public void  handle(MouseEvent event)
        {
        item.setDisable(true);
        item.setOpacity(1.0);
        ((Button)item).setText(myarr[i]);
        i=(++i)%2;
        
        }
        });                             
        });
         
        pane.getChildren().add(gridPane);
        pane.getChildren().add(button8);
        pane.getChildren().add(button9);
        pane.getChildren().add(text);
        pane.getChildren().add(text0);
        pane.getChildren().add(text1);
        pane.getChildren().add(text2);
        pane.getChildren().add(text3);
        pane.getChildren().add(text4);
        pane.getChildren().add(text5);
        pane.getChildren().add(text6);
        pane.getChildren().add(text7);
        pane.getChildren().add(text8);

    }
}
