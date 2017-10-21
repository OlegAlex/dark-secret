package Str;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class Main extends Application {
    private static final int WIDTH = 600;
    private static final int HEIGHT = 600;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane root = new Pane();

        StarInterface starInterface = new StarInterface();
        starInterface.starInterfaceInit(root);

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setWidth(WIDTH);
        primaryStage.setHeight(HEIGHT);
        primaryStage.setX(Screen.getPrimary().getBounds().getWidth() - primaryStage.getWidth());
        primaryStage.show();
    }
}
