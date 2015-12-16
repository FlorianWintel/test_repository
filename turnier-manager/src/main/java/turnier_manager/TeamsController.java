package turnier_manager;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class TeamsController implements Initializable, ControlledScreen{

    private ScreensController parent;
    @FXML private ListView<Team> teamsList;
    @FXML private TextField teamName;

    @Override
    public void setScreenParent(ScreensController screen) {
        this.parent = screen;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        ObservableList<Team> items = FXCollections.observableArrayList(new Team("foo"));

        teamsList.setItems(items);
    }

    public void addTeam () {
        Team team = new Team(teamName.getText());

        teamName.setText("");
    }

    public void gotoTournament(ActionEvent actionEvent) {
        parent.setScreen(Screens.TOURNAMENT_SCREEN);
    }
}
