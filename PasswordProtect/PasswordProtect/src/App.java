import javafx.stage.Stage;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;

public class App extends Application{
    public void start(Stage window){
        Label instructionText = new Label("Write the password and press Log in");
        PasswordField passwordField = new PasswordField();
        Button startButton = new Button("Log in");
        Label errorMessage = new Label("");

        GridPane layout = new GridPane();
        layout.add(instructionText, 0, 0);
        layout.add(passwordField, 0, 1);
        layout.add(startButton, 0, 2);
        layout.add(errorMessage, 0, 3);

        layout.setPrefSize(300, 180);
        layout.setAlignment(Pos.CENTER);
        layout.setVgap(10);
        layout.setHgap(10);
        layout.setPadding(new Insets(20, 20, 20, 20));

        Scene passwordView = new Scene(layout);

        Label welcomeText = new Label ("Welcome, this is the beginning!");
        StackPane welcomeLayout = new StackPane();
        welcomeLayout.setPrefSize(300, 180);
        welcomeLayout.getChildren().add(welcomeText);
        welcomeLayout.setAlignment(Pos.CENTER);

        Scene welcomScene = new Scene(welcomeLayout);

        startButton.setOnAction((event)-> {
            if (!passwordField.getText().trim().equals("password")){
                errorMessage.setText("Unknown password!");
                return;
            }
            window.setScene(welcomScene);
        });

        window.setScene(passwordView);
        window.show();
    }
    public static void main(String[] args)  {
        launch(App.class);
    }
}
