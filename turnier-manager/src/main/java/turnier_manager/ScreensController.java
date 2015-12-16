package turnier_manager;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;

import java.util.HashMap;

public class ScreensController extends Parent {

    private HashMap<String, Node> screens = new HashMap<>();

    void addScreen (final String name, final Node screen) {
        screens.put(name, screen);
    }

    public void loadScreen (final String name, final String resource) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(resource));
            Node screen = loader.load();
            ControlledScreen screenController = loader.getController();
            screenController.setScreenParent(this);
            addScreen(name, screen);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void setScreen (final String name) {
        Node screen = screens.get(name);

        if (screen != null) {
            //todo: implement animation

            getChildren().clear();
            getChildren().add(screen);

        } else {
            System.out.println("Screen '" + name + "' does not exist!");
        }
    }
}
