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

        layout.setBottom(hCollector);

        textArea.textProperty().addListener((change, oldValue, newValue) -> {
            int chars = newValue.length();
            lettersLabel.setText(String.format("Letters: %d", chars));

            String[] parts = newValue.split("\\s+");
            int words = parts.length;
            wordsLabel.setText(String.format("Words: %d", words));

            String largest = "";
            for (String part: parts) {
                if (part.length() > largest.length()){
                    largest = part;
                }
            }
            longestWordLabel.setText(String.format("The longest word is: %s", largest));
        });


        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.setTitle("Text Statistics");
        window.show();

    }
    public static void main(String[] args) {
        launch (App.class);
    }
}
