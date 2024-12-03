import java.lang.reflect.Field;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class App extends Application{
    @Override
    public void start (Stage window){
        Label intro = new Label("Enter your name and start");        
        TextField  nameField = new TextField ();
        Button start = new Button("start");
        GridPane layout = new GridPane();
        layout.add(intro, 0, 0);
        layout.add(nameField, 0, 1);
        layout.add(start, 0, 2);
        layout.setPrefSize(300, 180);
        layout.setAlignment(Pos.CENTER);
        layout.setVgap(10);
        layout.setHgap(10);
        layout.setPadding(new Insets(20, 20, 20, 20));


        // String name = "";
        Label welcomeText = new Label ("");
        StackPane welcomeLayout = new StackPane();
        welcomeLayout.setPrefSize(300, 180);
        welcomeLayout.getChildren().add(welcomeText);
        welcomeLayout.setAlignment(Pos.CENTER);

        Scene nameScene = new Scene (layout);
        Scene welcomeScene = new Scene (welcomeLayout);

        start.setOnAction((event) -> {
            String name = nameField.getText();
            welcomeText.setText(String.format("Welcome %s", name));
            window.setScene(welcomeScene);
        });

        window.setScene(nameScene);
        window.show();        
    }
    public static void main(String[] args) {
        launch(App.class);
    }
}
