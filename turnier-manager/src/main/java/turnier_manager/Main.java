package turnier_manager;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        ScreensController root = new ScreensController();
        root.loadScreen(Screens.TEAMS_SCREEN, Screens.TEAMS_SCREEN_FXML);
        root.loadScreen(Screens.TOURNAMENT_SCREEN, Screens.TOURNAMENT_FXML);
        root.setScreen(Screens.TEAMS_SCREEN);

        Scene scene = new Scene(root, 600, 500);
        primaryStage.setTitle("Turnier Manager");
        primaryStage.setScene(scene);
        primaryStage.show();
    }



    public static void main(String[] args) {
        launch(args);
    }
}
