import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application{
    public void start (Stage window){
        // first scene
        Label topLabel = new Label("First view!");
        VBox topBox = new VBox(topLabel);
        topBox.setAlignment(Pos.CENTER);

        Button toSecond = new Button("To the second view!!");
        VBox centerBox = new VBox(toSecond);
        centerBox.setAlignment(Pos.CENTER);

        BorderPane first = new BorderPane();
        first.setTop(topBox);
        first.setCenter(centerBox);

        // second scene
        Button toThird = new Button("To the third view!!!");
        Label secondLabel = new Label("Second view!!");
        VBox secondBox = new VBox(toThird, secondLabel);
        secondBox.setSpacing(20);
        secondBox.setAlignment(Pos.CENTER);

        // third scene
        Label thirdLabel = new Label("Third view!!!");
        Button toFirst = new Button("To the first view!");
        GridPane gridBox = new GridPane();
        gridBox.add(thirdLabel, 0, 0);
        gridBox.add(toFirst, 1, 1);
        gridBox.setAlignment(Pos.CENTER);


        Scene firstScene = new Scene(first,300,300);
        Scene secondScene = new Scene(secondBox,400,400);
        Scene thirdScene = new Scene(gridBox,500,500);
        toSecond.setOnAction((event) -> {
            window.setScene(secondScene);
        });
        toThird.setOnAction((event)-> {
            window.setScene(thirdScene);
        });
        toFirst.setOnAction((event)-> {
            window.setScene(firstScene);
        });


        window.setScene(firstScene);
        window.setTitle("MultipleViews");
        window.show();
    }

    public static void main(String[] args)  {
        launch(App.class);
    }
}
