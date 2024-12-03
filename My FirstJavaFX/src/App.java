
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage window) {

        //ελεμεντς
        Button button = new Button ("this is a button");
        
        Label textComponent = new Label("text element");

        TextField textFieldComponent = new TextField("Lorem ipsum dolor sit amet.");
        textFieldComponent.setPrefWidth(150);
        textFieldComponent.setPrefHeight(30);

        //ντισπλέι        
        //αυτό είναι σαν το display flow της css. είναι ένα div με τα πραγματά μου
        //1 FlowPane componentGroup = new FlowPane();
        //1 componentGroup.setVgap(10);

        //2 VBox componentGroup = new VBox();
        //2 componentGroup.setSpacing(10);
        //2 componentGroup.setAlignment(javafx.geometry.Pos.CENTER);

        //4 to hbox τυπώνει πράγματα στην σειρά.
        //4 HBox layout = new HBox();
        //4 layout.setAlignment(Pos.CENTER);
        //4 layout.setSpacing(10);
        //4 layout.getChildren().add(new Label("first"));
        //4 layout.getChildren().add(new Label("second"));
        //4 layout.getChildren().add(new Label("third"));

        //4sto borderpane δεν βαλαμε απλως τις τιμές αλλά φτια΄ξαμε 5 κουτια. τα κουτιά αυτά τα κάναμε center και βάλαμε τα κουτιά αντί για τα label
        //4 Label topLabel = new Label("top");
        //4 VBox topBox = new VBox(topLabel);
        //4 topBox.setAlignment(Pos.CENTER);
        //4 Label rightLabel = new Label("right");
        //4 VBox rightBox = new VBox(rightLabel);
        //4 rightBox.setAlignment(Pos.CENTER);
        //4 Label leftLabel = new Label("left");
        //4 VBox leftBox = new VBox(leftLabel);
        //4 leftBox.setAlignment(Pos.CENTER);
        //4 Label bottomLabel = new Label("bottom");
        //4 VBox bottomBox = new VBox(bottomLabel);
        //4 bottomBox.setAlignment(Pos.CENTER);
        // // Label centerLabel = new Label("center");
        //4 VBox centerBox = new VBox(layout);
        //4 centerBox.setAlignment(Pos.CENTER);

        //το Boarderpane τυπωνει πράγματα σε 5 θεσεις
        //4 BorderPane componentGroup = new BorderPane();
        //4 componentGroup.setTop(topBox);
        //4 componentGroup.setRight(rightBox);
        //4 componentGroup.setLeft(leftBox);
        //4 componentGroup.setBottom(bottomBox);
        //4 componentGroup.setCenter(centerBox);


        // to GridPane φτιάχνει έναν πίνακα ν*ν
        //5 GridPane layout = new GridPane();
        //5 for (int x = 1; x <= 3; x++){
        //5     for (int y = 1; y <= 3; y++){
        //5         layout.add(new Button("" + x + ", " + y), x, y);
        //5     }
        //5 }


        //2 componentGroup.getChildren().add(textComponent);
        //2 componentGroup.getChildren().add(textFieldComponent);
        //2 componentGroup.getChildren().add(button);

        //2 Scene scene = new Scene(componentGroup, 300, 200);

        //6 borderpane me hbox
        BorderPane layout = new BorderPane();
        HBox buttons = new HBox();
        buttons.setSpacing(10);
        buttons.getChildren().add(new Button("First"));
        buttons.getChildren().add(new Button("Second"));
        buttons.getChildren().add(new Button("Third"));

        VBox texts = new VBox();
        texts.setSpacing(10);
        texts.getChildren().add(new Label("First"));
        texts.getChildren().add(new Label("Second"));
        texts.getChildren().add(new Label("Third"));

        layout.setTop(buttons);
        layout.setLeft(texts);
        layout.setCenter(new TextArea(""));


        Scene scene = new Scene(layout);

        window.setScene(scene);
        window.setTitle("Hello World!");
        window.show();
    }

    public static void main(String[] args) {
        launch(App.class);
    }
}