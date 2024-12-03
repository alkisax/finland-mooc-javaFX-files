import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application{
    @Override
    public void start(Stage window){

        TextField text = new TextField();

        Label label = new Label();
        
        Button button = new Button("Update");
        button.setOnAction((event) -> {
            label.setText(text.getText());
        });

        VBox layout = new VBox(text, button, label);
        layout.setSpacing(10);
        // layout.getChildren().addAll(text, button, label);
    
        Scene scene = new Scene(layout);    
        window.setScene(scene);
        window.setTitle("Notifier");
        window.show();    
    }
    

    public static void main(String[] args) {
        launch(App.class);
    }
}
