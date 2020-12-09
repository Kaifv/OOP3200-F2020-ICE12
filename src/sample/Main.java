package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Labeled;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Main extends Application {

    public static int WIDTH = 658;
    public static int HEIGHT = 480;

    @Override
    public void start(Stage primaryStage) throws Exception{
       // Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");

        //Step 1 - create one or more control
        Label helloLabel = new Label("Hello world");

        Label goodByeLabel = new Label("Good Bye ");

        Button clickButton = new Button("Click me");

        //Step 1.1 - configure your controls
        Font font =  Font.font("Consolas", FontWeight.BOLD, 20);
        clickButton.setFont(font);

        //step 1.2 - for button controls or other event type control - set the event
        clickButton.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent actionEvent)
            {
               System.out.println("Click me Button Clicked");

               helloLabel.setText("Clicked");
            }
        });


        //Step 2 - creating a container
        //VBox vbox = new VBox(helloLabel, clickButton);

        GridPane gridPane = new GridPane();

        gridPane.add(helloLabel, 1, 0);
        gridPane.add(goodByeLabel, 1, 1);
        gridPane.add(clickButton, 2, 2);
        var children =  gridPane.getChildren();

        //Step 3 - add layout container to scene
        Scene scene = new Scene(gridPane, WIDTH, HEIGHT);

        //step 4 - add scene to stage
        primaryStage.setScene(scene);

        //Step 5 - show the stage
        primaryStage.show();
    }


    public static void main(String[] args) { launch(args); }
}
