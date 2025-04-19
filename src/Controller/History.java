package Controller;

import java.io.IOException;
import java.text.DecimalFormat;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class History {
    public History(){}
    public boolean isHistoryOpened = false;
    public static History his = new History();
    Stage window;
    
    public void openHistory() throws IOException
    {
        if(!isHistoryOpened)
        {
            window = new Stage();
            // window.initModality(Modality.APPLICATION_MODAL);
            window.setMinWidth(250);
            window.setMinHeight(150);
            
            window.setTitle("History");
            isHistoryOpened = true;
            Parent root = FXMLLoader.load(getClass().getResource("../resources/fxmls/history.fxml"));
            Scene scene = new Scene(root, Constants.GlobalConstants.sceneWidth, Constants.GlobalConstants.sceneHeight);
            ((Label)((HBox)((VBox)((ScrollPane)root).getContent()).getChildren().get(2)).getChildren().get(2)).setText("");
            window.setScene(scene);
            window.show();
            window.setOnCloseRequest(e -> {
                isHistoryOpened = false;
            });
            update();
        }
    }
    public void update() throws IOException
    {
        if (isHistoryOpened)
        {
            DecimalFormat df = new DecimalFormat("#");
            df.setMaximumFractionDigits(3);
            VBox temp = (VBox)((ScrollPane)window.getScene().getRoot()).getContent();
            for (int i = 0; i < 10; i++) {
                ((HBox)(temp.getChildren().get(i))).setVisible(false);
            }
            int j = 0;
            for (int i = Control.CalculationHistory.size() - 1 ; i >= (Control.CalculationHistory.size() > 10 ? Control.CalculationHistory.size()-10: 0) ; i--) {
                ((HBox)(temp.getChildren().get(j))).setVisible(true);
                ((Label)((HBox)(temp.getChildren().get(j))).getChildren().get(0)).setText(Control.CalculationHistory.get(i)+"=");
                ((Label)((HBox)(temp.getChildren().get(j))).getChildren().get(2)).setText(df.format(Control.AnswerHistory.get(i)));
                j++;
            }
        }
    }

}
