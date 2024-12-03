
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application{

    @Override
    public void start(Stage window){

        Button back = new Button("back...");
        Label secondPageLabel = new Label("SECOND PAGE!");       
        VBox secondFlow = new VBox(20, secondPageLabel, back);
        secondFlow.setAlignment(Pos.CENTER);
        Scene second = new Scene(secondFlow, 400, 400);

        Button forth = new Button("...forth");
        Label firstPageLabel = new Label("FIRST PAGE!");
        VBox firstFlow = new VBox(20, firstPageLabel, forth);
        firstFlow.setAlignment(Pos.CENTER);
        Scene first = new Scene(firstFlow, 500, 500);
        
        forth.setOnAction((event) -> {
            window.setScene(second);
        });
        back.setOnAction((event) -> {
            window.setScene(first);
        });

        window.setScene(first);
        window.show();
    }

    public static void main(String[] args)  {
        launch(App.class);
    }
}