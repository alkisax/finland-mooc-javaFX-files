import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.transform.Scale;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage window) {
        BorderPane layout = new BorderPane();
        
        TextArea textArea = new TextArea();
        layout.setCenter(textArea);

        Label lettersLabel = new Label("Letters: 0");
        Label wordsLabel = new Label("Words: 0");
        Label longestWordLabel = new Label("The longest word is:");
        HBox hCollector = new HBox(lettersLabel, wordsLabel, longestWordLabel);
        hCollector.setSpacing(10);

        // Label firstLabel = new Label("Letters: 0");
        // HBox firstBox = new HBox(firstLabel);
        // Label secondLabel = new Label("Words: 0");
        // HBox secondBox = new HBox(secondLabel);
        // Label thirdLabel = new Label("The longest word is:");
        // HBox thirdBox = new HBox(thirdLabel);

        // HBox hCollector = new HBox();
        // hCollector.setSpacing(10);
        // hCollector.getChildren().add(firstBox);
        // hCollector.getChildren().add(secondBox);
        // hCollector.getChildren().add(thirdBox);

        layout.setBottom(hCollector);

        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.setTitle("Text Statistics");
        window.show();

    }
    public static void main(String[] args) {
        launch (App.class);
    }
}
