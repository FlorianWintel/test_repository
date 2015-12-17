package turnier_manager;

public class TournamentController implements ControlledScreen{

    ScreensController parent;

    @Override
    public void setScreenParent(ScreensController screen) {
        parent = screen;
    }
}
