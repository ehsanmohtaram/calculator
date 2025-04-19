package gui;

import java.io.IOException;

import Controller.Control;
import Controller.History;
import Controller.Scientific;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import logic.Operator;

public class CalculatorGui {
    static public Label display;
    static public void makeGridPane(VBox vBox)
    {
        vBox.setPadding(new Insets(5,0,5,0));
        
        HBox hBox = new HBox();
        hBox.setMinHeight(40);
        hBox.setMinWidth(Constants.GlobalConstants.sceneWidth-20);
        //hBox.setStyle("-fx-background-color: #000000;");
        hBox.setPadding(new Insets(0 , 0 , 0 , 10));

        display = new Label();
        display.setMinWidth(Constants.GlobalConstants.sceneWidth - 50);
        display.setStyle("-fx-font-size : 25pt;-fx-font-weight:bold;-fx-text-fill:#ff8c00;");

        Button btnHistory = new Button("His");
        btnHistory.setId("historybtn");
        btnHistory.setOnAction(e -> {
            try{History.his.openHistory();}
            catch (IOException ex){}
        
        });
        Button btnChange = new Button("Sc");
        btnChange.setId("historybtn");
        btnChange.setOnAction(e->{
            Control.clear(true);
            try{Scientific.sc.open();}
            catch(IOException ex){System.out.println(ex.getMessage());}
        }); 
        VBox te = new VBox();
        te.getChildren().addAll(btnHistory,btnChange);
        hBox.getChildren().addAll(display,te);


        

        GridPane gridPane = new GridPane();

        gridPane.setPadding(new Insets(10, 10, 10, 10)); 
        gridPane.setVgap(5); 
        gridPane.setHgap(5);
        gridPane.setAlignment(Pos.CENTER); 
        
        ImageView view = new ImageView(new Image("resources/images/buttons/0.jpg"));
        view.setFitHeight(Constants.GlobalConstants.imageHeight);
        view.setFitWidth(Constants.GlobalConstants.imageWidth);
        view.setPreserveRatio(true);
        Button btn0 = new Button();
        btn0.setOnAction(e -> Controller.Control.addNumber("0"));
        btn0.setGraphic(view);

        view = new ImageView(new Image("resources/images/buttons/1.jpg"));
        view.setFitHeight(Constants.GlobalConstants.imageHeight);
        view.setFitWidth(Constants.GlobalConstants.imageWidth);
        view.setPreserveRatio(true);
        Button btn1 = new Button();
        btn1.setOnAction(e -> Controller.Control.addNumber("1"));
        btn1.setGraphic(view);
        
        view = new ImageView(new Image("resources/images/buttons/2.jpg"));
        view.setFitHeight(Constants.GlobalConstants.imageHeight);
        view.setFitWidth(Constants.GlobalConstants.imageWidth);
        view.setPreserveRatio(true);
        Button btn2 = new Button();
        btn2.setOnAction(e -> Controller.Control.addNumber("2"));
        btn2.setGraphic(view);
        
        view = new ImageView(new Image("resources/images/buttons/3.jpg"));
        view.setFitHeight(Constants.GlobalConstants.imageHeight);
        view.setFitWidth(Constants.GlobalConstants.imageWidth);
        view.setPreserveRatio(true);
        Button btn3 = new Button();
        btn3.setOnAction(e -> Controller.Control.addNumber("3"));
        btn3.setGraphic(view);

        view = new ImageView(new Image("resources/images/buttons/4.jpg"));
        view.setFitHeight(Constants.GlobalConstants.imageHeight);
        view.setFitWidth(Constants.GlobalConstants.imageWidth);
        view.setPreserveRatio(true);
        Button btn4 = new Button();
        btn4.setOnAction(e -> Controller.Control.addNumber("4"));
        btn4.setGraphic(view);

        view = new ImageView(new Image("resources/images/buttons/5.jpg"));
        view.setFitHeight(Constants.GlobalConstants.imageHeight);
        view.setFitWidth(Constants.GlobalConstants.imageWidth);
        view.setPreserveRatio(true);
        Button btn5 = new Button();
        btn5.setOnAction(e -> Controller.Control.addNumber("5"));
        btn5.setGraphic(view);

        view = new ImageView(new Image("resources/images/buttons/6.jpg"));
        view.setFitHeight(Constants.GlobalConstants.imageHeight);
        view.setFitWidth(Constants.GlobalConstants.imageWidth);
        view.setPreserveRatio(true);
        Button btn6 = new Button();
        btn6.setOnAction(e -> Controller.Control.addNumber("6"));
        btn6.setGraphic(view);

        view = new ImageView(new Image("resources/images/buttons/7.jpg"));
        view.setFitHeight(Constants.GlobalConstants.imageHeight);
        view.setFitWidth(Constants.GlobalConstants.imageWidth);
        view.setPreserveRatio(true);
        Button btn7 = new Button();
        btn7.setOnAction(e -> Controller.Control.addNumber("7"));
        btn7.setGraphic(view);

        view = new ImageView(new Image("resources/images/buttons/8.jpg"));
        view.setFitHeight(Constants.GlobalConstants.imageHeight);
        view.setFitWidth(Constants.GlobalConstants.imageWidth);
        view.setPreserveRatio(true);
        Button btn8 = new Button();
        btn8.setOnAction(e -> Controller.Control.addNumber("8"));
        btn8.setGraphic(view);

        view = new ImageView(new Image("resources/images/buttons/9.jpg"));
        view.setFitHeight(Constants.GlobalConstants.imageHeight);
        view.setFitWidth(Constants.GlobalConstants.imageWidth);
        view.setPreserveRatio(true);
        Button btn9 = new Button();
        btn9.setOnAction(e -> Controller.Control.addNumber("9"));
        btn9.setGraphic(view);
        
        view = new ImageView(new Image("resources/images/buttons/clear.jpg"));
        view.setFitHeight(Constants.GlobalConstants.imageHeight);
        view.setFitWidth(Constants.GlobalConstants.imageWidth);
        view.setPreserveRatio(true);
        Button btnClear = new Button();
        btnClear.setOnAction(e -> Controller.Control.clear(false));
        btnClear.setGraphic(view);
        
        view = new ImageView(new Image("resources/images/buttons/divide.jpg"));
        view.setFitHeight(Constants.GlobalConstants.imageHeight);
        view.setFitWidth(Constants.GlobalConstants.imageWidth);
        view.setPreserveRatio(true);
        Button btnDivide = new Button();
        btnDivide.setOnAction(e -> Controller.Control.setOperator(Operator.DIVIDE));
        btnDivide.setGraphic(view);

        view = new ImageView(new Image("resources/images/buttons/equal.jpg"));
        view.setFitHeight(Constants.GlobalConstants.imageHeight);
        view.setFitWidth(Constants.GlobalConstants.imageWidth);
        view.setPreserveRatio(true);
        Button btnEqual = new Button();
        btnEqual.setOnAction(e -> {
            try {Controller.Control.setEqual();}
            catch (IOException ex){}
        });
        btnEqual.setGraphic(view);

        view = new ImageView(new Image("resources/images/buttons/minus.jpg"));
        view.setFitHeight(Constants.GlobalConstants.imageHeight);
        view.setFitWidth(Constants.GlobalConstants.imageWidth);
        view.setPreserveRatio(true);
        Button btnMinus = new Button();
        btnMinus.setOnAction(e -> Controller.Control.setOperator(Operator.MINUS));
        btnMinus.setGraphic(view);

        view = new ImageView(new Image("resources/images/buttons/multiply.jpg"));
        view.setFitHeight(Constants.GlobalConstants.imageHeight);
        view.setFitWidth(Constants.GlobalConstants.imageWidth);
        view.setPreserveRatio(true);
        Button btnMultiply = new Button();
        btnMultiply.setOnAction(e -> Controller.Control.setOperator(Operator.MULTIPLY));
        btnMultiply.setGraphic(view);

        view = new ImageView(new Image("resources/images/buttons/plus.jpg"));
        view.setFitHeight(Constants.GlobalConstants.imageHeight);
        view.setFitWidth(Constants.GlobalConstants.imageWidth);
        view.setPreserveRatio(true);
        Button btnPlus = new Button();
        btnPlus.setOnAction(e -> Controller.Control.setOperator(Operator.PLUS));
        btnPlus.setGraphic(view);

        // gridPane.add(hBox, 0, 0);
        
        gridPane.add(btn0       , 1, 3);
        gridPane.add(btn1       , 0, 2);
        gridPane.add(btn2       , 1, 2);
        gridPane.add(btn3       , 2, 2);
        gridPane.add(btn4       , 0, 1);
        gridPane.add(btn5       , 1, 1);
        gridPane.add(btn6       , 2, 1);
        gridPane.add(btn7       , 0, 0);
        gridPane.add(btn8       , 1, 0);
        gridPane.add(btn9       , 2, 0);
        gridPane.add(btnClear   , 0, 3);
        gridPane.add(btnDivide  , 3, 2);
        gridPane.add(btnEqual   , 2, 3);
        gridPane.add(btnMinus   , 3, 1);
        gridPane.add(btnMultiply, 3, 3);
        gridPane.add(btnPlus    , 3, 0);

        vBox.getChildren().addAll(hBox,gridPane);
    }

}

