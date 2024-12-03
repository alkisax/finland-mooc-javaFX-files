import java.util.Scanner;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class App extends Application{

    @Override
    public void start(Stage window){
        Parameters parms = getParameters();
        String title = parms.getNamed().get("title");

        Label label = new Label("tester");
        HBox layout = new HBox(label);

        Scene scene = new Scene(layout, 700, 300);
        window.setScene(scene);
        window.setTitle(title);
        window.show();
    }



    public static void main(String[] args)  {

        Scanner scanner = new Scanner(System.in);
        System.out.print("give a title: ");
        String title = scanner.nextLine();
        launch(App.class,
        "--title=" + title);
    }
}
