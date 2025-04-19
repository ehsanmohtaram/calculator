package Controller;

import java.io.IOException;

import Constants.GlobalConstants;
import gui.CalculatorGui;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import logic.Operator;

public class Scientific{
    public static Scientific sc = new Scientific();
    public static Stage primaryStage;
    public Button changebnt,hisbtn,minusbtn,multiplybtn,num2,num5,dividebtn,num3,num6,num0,equalbtn,plusbnt,num8,num9,tanbtn,cosbtn,num1,num4,factorialbtn,clearbtn,sinbtn,num7,pibtn,logbtn,ebtn,absbtn,power2btn,powernbtn,modbtn,radicalbtn;
    public Label displayLabel;
    public void open() throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("../resources/fxmls/sientific.fxml"));
        Scene scene = new Scene(root , Constants.GlobalConstants.scSceneWidth , Constants.GlobalConstants.scSceneHeight);
        scene.getStylesheets().add(getClass().getResource("../style.css").toExternalForm());
        primaryStage.setScene(scene);
    }
    @FXML
    public void initialize() {
        displayLabel.textProperty().bind(Control.display);
    }
    public void handle(ActionEvent event) throws IOException{
        if (event.getSource() == changebnt) {
            Control.clear(true);
            VBox vBox = new VBox();
            CalculatorGui.makeGridPane(vBox);
            CalculatorGui.display.textProperty().bind(Control.display);
            Scene scene = new Scene(vBox, GlobalConstants.sceneWidth, GlobalConstants.sceneHeight, Color.WHEAT);
            scene.getStylesheets().add(getClass().getResource("../style.css").toExternalForm());
            primaryStage.setScene(scene);
        }            
        else if(event.getSource() == hisbtn)
            History.his.openHistory();
        else if(event.getSource() == num0)
            Control.addNumber("0");
        else if(event.getSource() == num1)
            Control.addNumber("1");
        else if(event.getSource() == num2)
            Control.addNumber("2");
        else if(event.getSource() == num3)
            Control.addNumber("3");
        else if(event.getSource() == num4)
            Control.addNumber("4");
        else if(event.getSource() == num5)
            Control.addNumber("5");
        else if(event.getSource() == num6)
            Control.addNumber("6");
        else if(event.getSource() == num7)
            Control.addNumber("7");
        else if(event.getSource() == num8)
            Control.addNumber("8");
        else if(event.getSource() == num9)
            Control.addNumber("9");
        else if(event.getSource() ==pibtn)
            Control.setSpacialNumber(Math.PI);
        else if(event.getSource() ==ebtn)
            Control.setSpacialNumber(Math.E);
        else if(event.getSource() == plusbnt)
            Control.setOperator(Operator.PLUS);
        else if(event.getSource() == minusbtn)
            Control.setOperator(Operator.MINUS);
        else if(event.getSource() == dividebtn)
            Control.setOperator(Operator.DIVIDE);
        else if(event.getSource() == multiplybtn)
            Control.setOperator(Operator.MULTIPLY);
        else if(event.getSource() == powernbtn)
            Control.setOperator(Operator.POWER);
        else if(event.getSource() == power2btn)
        {
            Control.setOperator(Operator.POWER);
            Control.addNumber("2");
            Control.setEqual();
        }
        else if(event.getSource() == modbtn)
            Control.setOperator(Operator.MOD);
        else if(event.getSource() == clearbtn)
            Control.clear(false);
        else if(event.getSource() == equalbtn)
            Control.setEqual();
        else if(event.getSource() == sinbtn)
            Control.oneOperator(Operator.SIN);
        else if(event.getSource() == cosbtn)
            Control.oneOperator(Operator.COS);
        else if(event.getSource() == tanbtn)
            Control.oneOperator(Operator.TAN);
        else if(event.getSource() == logbtn)
            Control.oneOperator(Operator.LOG);
        else if(event.getSource() == absbtn)
            Control.oneOperator(Operator.ABS);
        else if(event.getSource() == radicalbtn)
            Control.oneOperator(Operator.RADICAL);
        else if(event.getSource() == factorialbtn)
            Control.oneOperator(Operator.FACTORIAL);
    }
}
