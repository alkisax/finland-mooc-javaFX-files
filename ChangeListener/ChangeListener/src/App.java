import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage window) {

        TextField leftText = new TextField();
        TextField rightText = new TextField();
        Button button = new Button("Copy");

        button.setOnAction((event) -> {
            rightText.setText(leftText.getText());
        });

        HBox layout = new HBox();
        layout.setSpacing(20);
        layout.getChildren().addAll(leftText, button, rightText);

        leftText.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> change, String oldValue, String newValue) {
                System.out.println(oldValue + " -> " + newValue);
                rightText.setText(newValue); // Update rightText with new value
            }
        });

        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.show();
    }

    public static void main(String[] args) {
        launch(App.class);
    }
}
