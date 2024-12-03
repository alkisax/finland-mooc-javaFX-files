import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class App extends Application{
    @Override
    public void start(Stage window){
        String txt1 = "What do you call a bear with no teeth?";
        String txt2 = "A gummy bear.";
        String txt3 = "You can come up with a suitable explanation by yourself.";

        BorderPane layout = new BorderPane();
        HBox menu = new HBox();
        menu.setPadding(new Insets(20, 20, 20, 20));
        menu.setSpacing(10);

        Button first = new Button("Joke");
        Button second = new Button("Answer");
        Button third = new Button("Explanation");

        menu.getChildren().addAll(first, second, third);

        layout.setTop(menu);

        StackPane firstLayout = createView(txt1);
        StackPane secondLayout = createView(txt2);
        StackPane thirdLayout = createView(txt3);

        // Scene firstScene = new Scene(firstLayout);
        // Scene secodScene = new Scene(secondLayout);
        // Scene thirdScene = new Scene (thirdLayout);

        layout.setCenter(firstLayout);
        Scene scene = new Scene(layout);

        first.setOnAction((event) -> {
            layout.setCenter(firstLayout);
        });
        second.setOnAction((event) -> {
            layout.setCenter(secondLayout);
        });
        third.setOnAction((event) -> {
            layout.setCenter(thirdLayout);
        });

        window.setScene(scene);
        window.show();
    }

    public StackPane createView(String text){
        StackPane layout = new StackPane();
        layout.setPrefSize(300, 180);
        layout.getChildren().add(new Label(text));
        layout.setAlignment(Pos.CENTER);

        return layout;
    }
    
    
    public static void main(String[] args) {
        launch(App.class);
    }
}
