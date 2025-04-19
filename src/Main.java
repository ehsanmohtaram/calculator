import Constants.GlobalConstants;
import Controller.Control;
import Controller.Scientific;
import gui.CalculatorGui;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        //CalculatorGui calculator = new CalculatorGui();
        Scientific.primaryStage = primaryStage;
        VBox vBox = new VBox();
        
        CalculatorGui.makeGridPane(vBox);
        CalculatorGui.display.textProperty().bind(Control.display);
        Scene scene = new Scene(vBox, GlobalConstants.sceneWidth, GlobalConstants.sceneHeight, Color.WHEAT);

        primaryStage.setTitle("Calculator!");
        scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.setOnCloseRequest(e-> Platform.exit());
        //Parent root = FXMLLoader.load(getClass().getResource("resources/fxmls/sientific.fxml"));
        //primaryStage.setTitle("Hello World");
        //Scene scene = new Scene(root, 520, 377);
        //scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
        //primaryStage.setScene(scene);
        //primaryStage.show();
    }
}
