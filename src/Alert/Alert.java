package Alert;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
public class Alert {
    static public void display(String title, String message)
    {
        Stage window = new Stage();
        
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMinWidth(250);
        window.setMinHeight(150);

        Label label1 = new Label(message);  
        label1.setStyle("-fx-font-size : 15pt;-fx-text-fill:red;");
        Button closeButton = new Button("close");
        closeButton.setOnAction(e-> window.close());

        VBox layout = new VBox(15);
        layout.getChildren().addAll(label1 , closeButton);
        layout.setAlignment(Pos.CENTER);

        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.showAndWait();
    }
}
