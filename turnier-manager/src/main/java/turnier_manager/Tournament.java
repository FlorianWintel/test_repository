package turnier_manager;

import java.util.Collection;

public interface Tournament {
    Collection<Team> getTeams();
    void setMatch(int matchNumber, int goals1, int goals2) throws IndexOutOfBoundsException;
    Collection<Match> getMatches();
}
